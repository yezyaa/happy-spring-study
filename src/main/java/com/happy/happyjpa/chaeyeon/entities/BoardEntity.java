package com.happy.happyjpa.chaeyeon.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
//    @Column(name = "username", unique = true)
    private String name;
}
