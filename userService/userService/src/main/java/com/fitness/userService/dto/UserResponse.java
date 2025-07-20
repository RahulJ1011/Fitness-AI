package com.fitness.userService.dto;

import com.fitness.userService.model.UserRole;
import lombok.Data;


import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String id;
    private String lastName;
    private String firstName;
    private String password;
    private String email;
    private UserRole role = UserRole.USER;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;


}