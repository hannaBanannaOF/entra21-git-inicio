package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FranquiaDTO {
    private Long id;
    private String nome;

    public FranquiaDTO(FranquiaEntity entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
    }
}
