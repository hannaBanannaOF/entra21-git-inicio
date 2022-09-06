package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import com.entra21.primeiroprojetospring.view.service.FranquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/franquias")
public class FranquiaRestController {

    @Autowired
    private FranquiaService franquiaService;

    @Autowired
    private FranquiaRepository franquiaRepository;

    @GetMapping
    public List<FranquiaListagemDTO> getFranquias() {
        return franquiaService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaEntity entity) {
        franquiaRepository.save(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FranquiaEntity> getFranquia(@PathVariable(name = "id") Long id) {
        Optional<FranquiaEntity> franquia = franquiaRepository.findById(id);
        if (franquia.isPresent()) {
            return ResponseEntity.ok(franquia.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        franquiaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FranquiaEntity> updateFranquia(@PathVariable(name = "id") Long id,
                                         @RequestBody String novoNome) {
        Optional<FranquiaEntity> entity = franquiaRepository.findById(id);
        if (entity.isPresent()) {
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(franquiaRepository.save(entity.get()));
        } else {
            return ResponseEntity.notFound().build() ;
        }
    }
}
