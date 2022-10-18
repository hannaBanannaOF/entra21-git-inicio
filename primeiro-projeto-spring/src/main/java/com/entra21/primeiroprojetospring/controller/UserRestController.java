package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.CadastroDTO;
import com.entra21.primeiroprojetospring.model.dto.LoginDTO;
import com.entra21.primeiroprojetospring.model.dto.UserDTO;
import com.entra21.primeiroprojetospring.view.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginDTO login) {
        // Se retornar true, login sucesso
        return new UserDTO(service.getLogin(login));
    }

    @PostMapping("/cadastro")
    public void cadastro(@RequestBody CadastroDTO dto) {
        service.criar(dto);
    }
}