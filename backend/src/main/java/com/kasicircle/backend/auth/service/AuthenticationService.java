package com.kasicircle.backend.auth.service;

import com.kasicircle.backend.auth.dto.AuthenticationResponse;
import com.kasicircle.backend.auth.dto.RegisterRequest;
import com.kasicircle.backend.users.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class AuthenticationService {

    private final UserService userService;

    public AuthenticationService(UserService userService) {
        this.userService = userService;
    }

    public AuthenticationResponse register(@Valid RegisterRequest request) {
        userService.createUser(request);

        return new AuthenticationResponse(null);
    }
}
