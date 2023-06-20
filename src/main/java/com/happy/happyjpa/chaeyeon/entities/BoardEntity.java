package com.happy.happyjpa.chaeyeon.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data // Lombok
@Entity
@Table(name = "board") // 생성되는 테이블의 이름을 "board"로
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    //    @Column(name = "username", unique = true) // Unique Constraint 및 컬럼 이름 지정
    private String name;
}
