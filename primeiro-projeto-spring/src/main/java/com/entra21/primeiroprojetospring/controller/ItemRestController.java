package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.view.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemRestController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemListagemDTO> getAll(
            @RequestParam(name = "idGenero", required = false) Long idGenero) {
        return itemService.getAll(idGenero);
    }
}
