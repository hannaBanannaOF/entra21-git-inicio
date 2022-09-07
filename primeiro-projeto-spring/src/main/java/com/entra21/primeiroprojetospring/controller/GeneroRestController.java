package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.view.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroRestController {

    @Autowired
    private GeneroService generoService;
    
    @GetMapping
    public List<GeneroDTO> getGeneros() {
        return generoService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody GeneroPayloadDTO payload) {
        generoService.save(payload);
    }

    @GetMapping("/{id}")
    public GeneroDTO getFranquia(@PathVariable(name = "id") Long id) {
        return generoService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        generoService.delete(id);
    }

    @PutMapping("/{id}")
    public GeneroDTO updateFranquia(@PathVariable(name = "id") Long id,
                                                         @RequestBody String novoNome) {
        return generoService.update(id, novoNome);
    }
}
