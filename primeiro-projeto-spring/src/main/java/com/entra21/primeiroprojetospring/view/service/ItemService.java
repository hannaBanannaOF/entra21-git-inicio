package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.ETipoItem;
import com.entra21.primeiroprojetospring.model.dto.ItemDetalhesDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemListagemDTO> getAll(String titulo, Long idFranquia, ETipoItem tipo) {
        List<ItemEntity> list;
        if (idFranquia != null && (titulo != null && !titulo.isBlank() && !titulo.isEmpty())) {
            list = itemRepository.findAllByFranquia_IdAndTituloContaining(idFranquia, titulo);
        } else if (titulo != null && !titulo.isBlank() && !titulo.isEmpty()) {
            list = itemRepository.findAllByTituloContaining(titulo);
        } else if (idFranquia != null) {
            list = itemRepository.findAllByFranquia_Id(idFranquia);
        } else {
            list = itemRepository.findAll();
        }

        if (tipo != null) {
            list = list.stream().filter(it -> tipo.equals(it.getType())).collect(Collectors.toList());
        }

        return list.stream().map(i -> {
            ItemListagemDTO dto = new ItemListagemDTO();
            dto.setId(i.getId());
            dto.setTitulo(i.getTitulo());
            dto.setEmprestado(i.getEmprestado());
            dto.setTipo(i.getType());
            return dto;
        }).collect(Collectors.toList());
    }

    public ItemDetalhesDTO getByid(Long id) {
        return itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)).toDTO();
    }

    public void atualizarStatusEmprestimo(Long id, boolean statusEmprestimo) {
        ItemEntity item = itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        item.setEmprestado(statusEmprestimo);
        itemRepository.save(item);
    }
}
