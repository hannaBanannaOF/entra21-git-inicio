package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class DvdDetalheDTO extends ItemDetalhesDTO{

    private String diretor;
    private LocalTime duracao;
    private Integer anoLancamento;

}
