package com.dhmi.ais.controller;

import com.dhmi.ais.domain.entity.Role;
import com.dhmi.ais.domain.entity.User;
import com.dhmi.ais.repository.RoleRepository;
import com.dhmi.ais.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> getAllUsers() {
        return userService.readAllUsers();
    }

    @GetMapping("/users/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> getUser(@PathVariable(value = "id") Long id) {
        return userService.readById(id);
    }

    @DeleteMapping("/delete-user/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long id) {
        return userService.deleteUser(id);
    }
}
