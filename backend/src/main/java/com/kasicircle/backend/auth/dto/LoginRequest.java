package com.kasicircle.backend.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
        @NotBlank(message = "Email is required")
        @Email(message = "Email must be valid")
        @Size(max = 26, message = "Email must not exceed 26 characters")
        String email,

        @NotBlank(message = "Password is required")
        @Size(max = 25, message = "Password must not exceed 25 characters")
        String password
) {
}
