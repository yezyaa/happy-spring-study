package com.example.chaeyeon;

import com.example.chaeyeon.dto.CommentDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/article/{articleId}/comments")
public class CommentController {
    private final CommentService service;

    @PostMapping
    public CommentDto create(
            @PathVariable("articleId") Long articleId,
            @RequestBody CommentDto dto
    ) {
        return service.createComment(articleId, dto);
    }

    @GetMapping
    public List<CommentDto> readAll(
            @PathVariable("articleId") Long articleId
    ) {
        return service.readCommentAll(articleId);
    }

    @PutMapping("/{commentId}")
    public CommentDto update(
            @PathVariable("articleId") Long articleId,
            @PathVariable("commentId") Long commentId,
            @RequestBody CommentDto dto
    ) {
        return service.updateComment(articleId, commentId, dto);
    }

    @DeleteMapping("/{commentId}")
    public void delete(
            @PathVariable("articleId") Long articleId,
            @PathVariable("commentId") Long commentId
    ) {
        service.deleteComment(articleId, commentId);
    }
}
