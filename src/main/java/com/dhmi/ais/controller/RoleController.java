package com.dhmi.ais.controller;

import com.dhmi.ais.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/role/{id}")
    public ResponseEntity<?> getAllCountries(@PathVariable(value = "id") Long id ) {
        return roleService.getById(id);
    }

}
