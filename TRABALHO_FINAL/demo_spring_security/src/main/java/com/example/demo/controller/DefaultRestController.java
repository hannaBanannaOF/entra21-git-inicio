package com.example.demo.controller;

import com.example.demo.dto.CadastroDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultRestController {

    @Autowired
    private UserService service;

    @GetMapping
    public String getUsername() {
        return ((UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId().toString();
    }

    @PostMapping
    @RequestMapping("/cadastro")
    public void cadastro(@RequestBody CadastroDTO dto) {
        service.criar(dto);
    }
}
