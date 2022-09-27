package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.ETipoItem;
import lombok.Data;

import java.util.List;

@Data
public abstract class ItemDetalhesDTO {
    private Long id;
    private String titulo;
    private Double valorVenda;
    private Double valorLocacao;
    private Boolean emprestado;
    private FranquiaDTO franquia;
    private List<GeneroDTO> generos;
    private ETipoItem tipo;
}
