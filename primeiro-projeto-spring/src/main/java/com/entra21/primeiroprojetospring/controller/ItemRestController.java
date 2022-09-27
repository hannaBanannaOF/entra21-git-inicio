package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.ETipoItem;
import com.entra21.primeiroprojetospring.model.dto.ItemDetalhesDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.view.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemRestController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemListagemDTO> getAll(
            @RequestParam(name = "titulo", required = false) String titulo,
            @RequestParam(name = "franquia", required = false) Long idFranquia,
            @RequestParam(name = "tipo", required = false)ETipoItem tipo
            ) {
        return itemService.getAll(titulo, idFranquia, tipo);
    }

    @GetMapping("/{id}")
    public ItemDetalhesDTO getById(@PathVariable(name = "id") Long id) {
        return itemService.getByid(id);
    }

    @PutMapping("/{id}/emprestar")
    public void emprestarItem(@PathVariable(name = "id") Long id) {
        itemService.atualizarStatusEmprestimo(id, true);
    }

    @PutMapping("/{id}/devolver")
    public void devolverItem(@PathVariable(name = "id") Long id) {
        itemService.atualizarStatusEmprestimo(id, false);
    }
}
