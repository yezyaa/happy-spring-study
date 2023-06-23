package com.example.yezy.dto;

import com.example.yezy.entity.ArticleEntity;
import lombok.Data;

@Data
public class ArticleDto {
    // 서버와 클라이언트가 주고받을 데이터의 표현 형식
    private Long id;
    private String writer;
    private String title;
    private String content;

    public static ArticleDto fromEntity(ArticleEntity entity) {
        ArticleDto dto = new ArticleDto();
        dto.setId(entity.getId());
        dto.setWriter(entity.getWriter());
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        return dto;
    }
}
