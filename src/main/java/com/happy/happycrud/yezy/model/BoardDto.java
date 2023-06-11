package com.happy.happycrud.yezy.model;

public class BoardDto {
    private Long id; // 번호
    private String title; // 제목
    private String content; // 내용
    private String name; // 작성자

    public BoardDto() {
    }

    public BoardDto(Long id, String title, String content, String name) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.name = name;
    }
}