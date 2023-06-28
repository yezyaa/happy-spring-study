//package com.example.chaeyeon;
//
//import com.example.chaeyeon.dto.ArticleDto;
//import com.example.chaeyeon.entity.ArticleEntity;
//import com.example.chaeyeon.repository.ArticleRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class ArticleService {
//    private final ArticleRepository repository;
//
//    public ArticleDto createArticle(ArticleDto dto) {
//        ArticleEntity newArticle = new ArticleEntity();
//        newArticle.setTitle(dto.getTitle());
//        newArticle.setWriter(dto.getWriter());
//        newArticle.setContent(dto.getContent());
//        return ArticleDto.fromEntity(repository.save(newArticle));
//    }
//
//    public ArticleDto readArticle(Long id) {
//        Optional<ArticleEntity> optionalArticle
//                = repository.findById(id);
//        if (optionalArticle.isPresent())
//            return ArticleDto.fromEntity(optionalArticle.get());
//        else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//    }
//
//    public List<ArticleDto> readArticleAll() {
//        List<ArticleDto> articleList = new ArrayList<>();
//        for (ArticleEntity entity : repository.findAll()) {
//            articleList.add(ArticleDto.fromEntity(entity));
//        }
//        return articleList;
//    }
//
//    public ArticleDto updateArticle(Long id, ArticleDto dto) {
//        Optional<ArticleEntity> optionalArticle
//                = repository.findById(id);
//        if (optionalArticle.isPresent()) {
//            ArticleEntity targetEntity = optionalArticle.get();
//            targetEntity.setTitle(dto.getTitle());
//            targetEntity.setWriter(dto.getWriter());
//            targetEntity.setContent(dto.getContent());
//            return ArticleDto.fromEntity(repository.save(targetEntity));
//        } else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//    }
//
//    public void deleteArticle(Long id) {
//        if (repository.existsById(id)) {
//            repository.deleteById(id);
//        } else throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//    }
//
//    public List<ArticleDto> readArticlePaged() {
//        List<ArticleDto> articleDtoList = new ArrayList<>();
//        for (ArticleEntity entity : repository.findTop20ByOrderByIdDesc()) {
//            articleDtoList.add(ArticleDto.fromEntity(entity));
//        }
//        return articleDtoList;
//    }
//}
