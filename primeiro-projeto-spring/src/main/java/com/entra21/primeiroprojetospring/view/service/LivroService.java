package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.LivroPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.DvdEntity;
import com.entra21.primeiroprojetospring.model.entity.LivroEntity;
import com.entra21.primeiroprojetospring.view.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class LivroService implements IItemCRUDService<LivroPayloadDTO> {

    @Autowired
    private LivroRepository repository;

    @Autowired
    private FranquiaService franquiaService;

    @Autowired
    private GeneroService generoService;

    @Override
    public void adicionar(LivroPayloadDTO payload) {
        LivroEntity newE = new LivroEntity();
        newE.setFranquia(franquiaService.getFranquiaById(payload.getIdFranquia()));
        newE.setGeneros(payload.getIdsGeneros().stream().map(idGen -> generoService.getGeneroById(idGen)).collect(Collectors.toSet()));
        newE.setTitulo(payload.getTitulo());
        newE.setValorLocacao(payload.getValorLocacao());
        newE.setValorVenda(payload.getValorVenda());
        newE.setAnoPublicacao(payload.getAnoPublicacao());
        newE.setAutor(payload.getAutor());
        newE.setEdicao(payload.getEdicao());
        newE.setQtdePaginas(payload.getQtdePaginas());
        newE.setEmprestado(false);
        repository.save(newE);
    }
}
