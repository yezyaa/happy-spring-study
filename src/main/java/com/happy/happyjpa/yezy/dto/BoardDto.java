package com.happy.happyjpa.yezy.dto;

import com.happy.happyjpa.yezy.entities.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 생성자 자동 생성
public class BoardDto {
    private Long id; // Entity.id
    private String title; // Entity.title
    private String content; // Entity.content

    // 정적 팩토리 메소드 패턴
    // static factory method pattern
    public static BoardDto fromEntity(BoardEntity boardEntity) {
        return new BoardDto(
                boardEntity.getId(),
                boardEntity.getTitle(),
                boardEntity.getContent()
        );
    }
}
