package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

import java.util.List;

@Data
public abstract class ItemPayloadDTO {
    private String titulo;
    private Double valorVenda;
    private Double valorLocacao;
    private Long idFranquia;
    private List<Long> idsGeneros;
}
