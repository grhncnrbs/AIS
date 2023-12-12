package com.dhmi.ais.service;

import org.springframework.http.ResponseEntity;

public interface RoleService {

    ResponseEntity<?> getById(Long id);
    ResponseEntity<?> getByName(String name);

}
