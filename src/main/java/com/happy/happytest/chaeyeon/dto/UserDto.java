package com.happy.happytest.chaeyeon.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String bio;
    private String avatar;
}
