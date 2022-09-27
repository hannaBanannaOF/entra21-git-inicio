package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

@Data
public class LivroDetalheDTO extends ItemDetalhesDTO {
    private String autor;
    private Integer qtdePaginas;
    private Integer anoPublicacao;
    private Integer edicao;
}
