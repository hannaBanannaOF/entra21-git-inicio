package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.DvdPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.LivroPayloadDTO;
import com.entra21.primeiroprojetospring.view.service.DvdService;
import com.entra21.primeiroprojetospring.view.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemCRUDRestController {

    @Autowired
    private DvdService dvdService;

    @Autowired
    private LivroService livroService;

    @PostMapping("/dvd/adicionar")
    public void adicionarDvd(@RequestBody DvdPayloadDTO payload) {
        dvdService.adicionar(payload);
    }

    @PostMapping("/livro/adicionar")
    public void adicionarLivro(@RequestBody LivroPayloadDTO payload) {
        livroService.adicionar(payload);
    }
}
