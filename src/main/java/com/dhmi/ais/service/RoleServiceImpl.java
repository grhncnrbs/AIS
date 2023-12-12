package com.dhmi.ais.service;

import com.dhmi.ais.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public ResponseEntity<?> getById(Long id) {
        return ResponseEntity.ok(roleRepository.findById(id));
    }

    @Override
    public ResponseEntity<?> getByName(String name) {
        return ResponseEntity.ok(roleRepository.findByName(name));
    }
}
