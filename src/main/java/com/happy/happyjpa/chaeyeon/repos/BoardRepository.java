//package com.happy.happyjpa.chaeyeon.repos;
//
//import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//
//public interface BoardRepository
//        // JpaRepository<내가 사용할 Entity, 그 Entity의 ID 컬럼의 타입>
//        extends JpaRepository<BoardEntity, Long> {
//
//    // Spring Data JPA = Query Method
//    // 메소드 이름을 우리가 조회하고 싶으 조건을 붙여서 만든다.
//    // 하나 또는 많이
//    // (findBy || findAllBy) + [(Column + 조건) * n] + [OrderBy + Column]
//
//    // SELECT * FROM board ORDER BY id DESC
//    List<BoardEntity> findAllByOrderIdDesc();
//
//    // SELECT * FROM board WHERE name LIKE "%"?;
//    List<BoardEntity> findAllByNameEndingWith(String name);
//
//    // SELECT * FROM board WHERE id <= 5;
//    List<BoardEntity> findAllByIdLessThanEqual(Integer id);
//
//
//}
