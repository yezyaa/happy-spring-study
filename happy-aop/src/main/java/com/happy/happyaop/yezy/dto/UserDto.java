package com.happy.happyaop.yezy.dto;

import lombok.Data;

// UserDto
@Data
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String passwordCheck;
    private String email;
    private String phone;
}
