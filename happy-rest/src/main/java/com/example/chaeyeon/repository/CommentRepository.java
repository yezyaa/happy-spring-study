package com.example.chaeyeon.repository;

import com.example.chaeyeon.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // CommentEntity 중 articleId가
    // id인 CommentEntity만 반환하는 메소드
    List<CommentEntity> findAllByArticleId(Long id);
}
