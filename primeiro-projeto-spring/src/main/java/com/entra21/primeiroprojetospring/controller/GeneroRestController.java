package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroRestController {

    @Autowired
    private GeneroRepository generoRepository;
    
    @GetMapping
    public List<GeneroEntity> getGeneros() {
        return generoRepository.findAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody GeneroEntity entity) {
        generoRepository.save(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneroEntity> getFranquia(@PathVariable(name = "id") Long id) {
        Optional<GeneroEntity> franquia = generoRepository.findById(id);
        if (franquia.isPresent()) {
            return ResponseEntity.ok(franquia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        generoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneroEntity> updateFranquia(@PathVariable(name = "id") Long id,
                                                         @RequestBody String novoNome) {
        Optional<GeneroEntity> entity = generoRepository.findById(id);
        if (entity.isPresent()) {
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(generoRepository.save(entity.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
