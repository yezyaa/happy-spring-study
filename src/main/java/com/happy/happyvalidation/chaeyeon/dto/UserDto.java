package com.happy.happyvalidation.chaeyeon.dto;

import jakarta.validation.constraints.NotBlank;

public class UserDto {
    private Long id;

    @NotBlank(message = "username is required")
    private String username;

    private String email;

}
