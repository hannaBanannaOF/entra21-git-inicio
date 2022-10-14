package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.CadastroDTO;
import com.entra21.primeiroprojetospring.view.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public boolean login() {
        // Se retornar true, login sucesso
        return true;
    }

    @PostMapping("/cadastro")
    public void cadastro(@RequestBody CadastroDTO dto) {
        service.criar(dto);
    }
}