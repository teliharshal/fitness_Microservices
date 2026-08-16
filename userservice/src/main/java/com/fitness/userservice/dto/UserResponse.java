package com.fitness.userservice.dto;
import com.fitness.userservice.models.UserRole;
import lombok.Data;
import java.time.LocalDateTime;
@Data
public class UserResponse {
    private String id;
    private String email;
    private String pasword;
    private String firstname;
    private String lastname;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
