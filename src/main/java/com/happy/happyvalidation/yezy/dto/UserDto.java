package com.happy.happyvalidation.yezy.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    @NotBlank(message = "username is required")
    private String username;
    @NotBlank(message = "username is required")
    private String email;
}
