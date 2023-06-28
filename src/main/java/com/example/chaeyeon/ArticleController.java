package com.example.chaeyeon;

import com.example.chaeyeon.dto.ArticleDto;
import com.example.chaeyeon.entity.ArticleEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService service;

    @PostMapping
    public ArticleDto create(@RequestBody ArticleDto dto) {
        return service.createArticle(dto);
    }

    @GetMapping
    public List<ArticleDto> readAll() {
        return service.readArticleAll();
    }

    @GetMapping("/{id}")
    public ArticleDto read(@PathVariable("id") Long id) {
        return service.readArticle(id);
    }

    @PutMapping("/{id}")
    public ArticleDto update(
            @PathVariable("id") Long id,
            @RequestBody ArticleDto dto) {
        return service.updateArticle(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteArticle(id);
    }

    @GetMapping("/page-test")
    public List<ArticleDto> readPageTest() {
        return service.readArticlePaged();
    }

    @GetMapping("/search")
    public Page<ArticleDto> search(
            @RequestParam("query") String query,
            @RequestParam(value = "page", defaultValue = "0")
            Integer pageNumber
    ) {
        return this.service.searchArticles(query, pageNumber);
    }
}
