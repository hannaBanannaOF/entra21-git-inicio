package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.DvdPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.DvdEntity;
import com.entra21.primeiroprojetospring.view.repository.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DvdService implements IItemCRUDService<DvdPayloadDTO> {

    @Autowired
    private DvdRepository repository;

    @Autowired
    private FranquiaService franquiaService;

    @Autowired
    private GeneroService generoService;

    public void adicionar(DvdPayloadDTO payload) {
        DvdEntity newE = new DvdEntity();
        newE.setFranquia(franquiaService.getFranquiaById(payload.getIdFranquia()));
        newE.setGeneros(payload.getIdsGeneros().stream().map(idGen -> generoService.getGeneroById(idGen)).collect(Collectors.toSet()));
        newE.setTitulo(payload.getTitulo());
        newE.setValorLocacao(payload.getValorLocacao());
        newE.setValorVenda(payload.getValorVenda());
        newE.setDiretor(payload.getDiretor());
        newE.setDuracao(payload.getDuracao());
        newE.setAnoLancamento(payload.getAnoLancamento());
        newE.setEmprestado(false);
        repository.save(newE);
    }

}
