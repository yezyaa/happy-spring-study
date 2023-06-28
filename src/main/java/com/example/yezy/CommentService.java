//package com.example.yezy;
//
//import com.example.yezy.dto.CommentDto;
//import com.example.yezy.entity.ArticleEntity;
//import com.example.yezy.entity.CommentEntity;
//import com.example.yezy.repository.ArticleRepository;
//import com.example.yezy.repository.CommentRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class CommentService {
//    private final ArticleRepository articleRepository;
//    private final CommentRepository commentRepository;
//
//    public CommentDto createComment(Long articleId, CommentDto dto) {
//        Optional<ArticleEntity> optionalArticle
//                = articleRepository.findById(articleId);
//        if (optionalArticle.isEmpty())
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        CommentEntity newComment = new CommentEntity();
//        newComment.setWriter(dto.getWriter());
//        newComment.setContent(dto.getContent());
//        newComment.setArticleId(optionalArticle.get().getId());
//        return CommentDto.fromEntity(commentRepository.save(newComment));
//    }
//
//    public List<CommentDto> readCommentAll(Long articleId) {
//        List<CommentDto> commentList = new ArrayList<>();
//        for (CommentEntity entity: commentRepository.findAllByArticleId(articleId)) {
//            commentList.add(CommentDto.fromEntity(entity));
//        }
//        return commentList;
//    }
//
//    public CommentDto updateComment(Long articleId, Long commentId, CommentDto dto) {
//        Optional<CommentEntity> optionalComment
//                = commentRepository.findById(commentId);
//        if (optionalComment.isEmpty())
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        CommentEntity comment = optionalComment.get();
//        if (!articleId.equals(comment.getArticleId()))
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//
//        comment.setContent(dto.getContent());
//        comment.setWriter(dto.getWriter());
//        return CommentDto.fromEntity(commentRepository.save(comment));
//    }
//
//    public void deleteComment(Long articleId, Long commentId) {
//        Optional<CommentEntity> optionalComment
//                = commentRepository.findById(commentId);
//        if (optionalComment.isEmpty())
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        CommentEntity comment = optionalComment.get();
//        if (!articleId.equals(comment.getArticleId()))
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//
//        commentRepository.deleteById(commentId);
//    }
//}