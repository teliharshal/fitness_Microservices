package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email is Required")
    @Email(message = "Email Format is wrong")
    private String email;
    @NotBlank(message = "password is required")
    @Size(min = 6, message = "Password Must be have at least 6 characters")
    private String password;
    private String firstname;
    private String lastname;
}
