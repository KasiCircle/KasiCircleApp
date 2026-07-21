package com.kasicircle.backend.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message = "First name is required")
        @Size(max = 15, message = "First name must not exceed 15 characters")
        String firstName,

        @NotBlank(message = "Last name is required")
        @Size(max = 15, message = "Last name must not exceed 15 characters")
        String lastName,

        @NotBlank(message = "Email is required")
        @Email(message = "Email must be valid")
        @Size(max = 26, message = "Email must not exceed 26 characters")
        String email,

        @NotBlank(message = "Phone number is required")
        @Pattern(
                regexp = "^\\+?[1-9]\\d{7,14}$",
                message = "Phone number must be in international format"
        )
        String phoneNumber,

        @NotBlank(message = "Password is required")
        @Size(min = 8, max = 25, message = "Password must be between 8 and 25 characters")
        String password
) {
}
