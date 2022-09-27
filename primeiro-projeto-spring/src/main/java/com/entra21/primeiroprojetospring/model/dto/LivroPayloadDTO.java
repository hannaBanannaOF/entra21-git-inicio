package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

@Data
public class LivroPayloadDTO extends ItemPayloadDTO {
    private String autor;
    private Integer qtdePaginas;
    private Integer anoPublicacao;
    private Integer edicao;
}
