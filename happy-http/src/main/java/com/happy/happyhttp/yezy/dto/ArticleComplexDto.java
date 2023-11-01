package com.happy.happyhttp.yezy.dto;

import lombok.Data;

import java.util.List;

@Data
public class ArticleComplexDto {
    private String title;
    private String content;
    private String writer;
    private List<String> comments;
}
