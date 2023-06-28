//package com.example.chaeyeon.repository;
//
//import com.example.chaeyeon.entity.ArticleEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//
//public interface ArticleRepository
//        extends JpaRepository<ArticleEntity, Long> {
//    // ID가 큰 순서대로 최상위 20개
//    List<ArticleEntity> findTop20ByOrderByIdDesc();
//
//    // ID가 특정 값보다 작은 데이터 중 큰 순서대로 최상위 20개
//    List<ArticleEntity> findTop20ByIdLessThanOrderByIdDesc(Long id);
//}
