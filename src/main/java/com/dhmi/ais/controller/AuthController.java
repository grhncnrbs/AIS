package com.dhmi.ais.controller;

import com.dhmi.ais.domain.dto.LoginRequestDto;
import com.dhmi.ais.domain.dto.LoginResponseDto;
import com.dhmi.ais.domain.dto.RegisterRequestDto;
import com.dhmi.ais.security.service.AuthenticationService;
import com.dhmi.ais.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthenticationService authenticationService;
    @Autowired
    UserService userService;

    @GetMapping
    public ModelAndView loginPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }



    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> authenticateUser(@Valid @RequestBody LoginRequestDto loginRequest) {
        return authenticationService.authenticateLoginRequest(loginRequest);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequestDto request) {
        return userService.create(request);
    }
}
