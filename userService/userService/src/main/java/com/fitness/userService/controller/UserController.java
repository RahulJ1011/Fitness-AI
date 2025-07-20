package com.fitness.userService.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fitness.userService.dto.UserResponse;
import com.fitness.userService.service.userService;
import com.fitness.userService.dto.RegisterRequest;
@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController
{

    private  userService userservice;
    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse>getUserProfile(@PathVariable String userId)
    {
        return ResponseEntity.ok(userservice.getUserProfile(userId));
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse>register(@Valid @RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(userservice.register(request));
    }
}
