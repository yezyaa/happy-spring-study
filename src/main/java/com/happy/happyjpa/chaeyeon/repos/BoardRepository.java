package com.happy.happyjpa.chaeyeon.repos;

import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// 데이터베이스와 소통하기 위한 창구
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    // JpaRepository<내가 사용할 Entity, 그 Entity의 ID 컬럼의 타입>
    // Spring Data JPA = Query Method
    // 메소드 이름을 우리가 조회하고 싶은 조건을 붙여서 만든다.
    // 하나 또는 많이
    // (findBy || findAllBy) + [(Column + 조건) * n] + [OrderBy + Column]

    // SELECT ORDER BY
    // SELECT * FROM board ORDER BY id DESC;
    List<BoardEntity> findAllByOrderByIdDesc();

}
