package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FranquiaService {

    @Autowired
    private FranquiaRepository franquiaRepository;

    public List<FranquiaListagemDTO> getAll() {
        return franquiaRepository.findAll().stream().map(fr -> {
            FranquiaListagemDTO dto = new FranquiaListagemDTO();
            dto.setId(fr.getId());
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }
}
