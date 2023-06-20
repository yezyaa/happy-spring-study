package com.happy.happyjpa.chaeyeon.dto;

import com.happy.happyjpa.chaeyeon.entities.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;

    // static factory method
    public static BoardDto fromEntity(BoardEntity entity) {
        return new BoardDto(
                entity.getId(),
                entity.getTitle(),
                entity.getContent()
        );
    }
}
