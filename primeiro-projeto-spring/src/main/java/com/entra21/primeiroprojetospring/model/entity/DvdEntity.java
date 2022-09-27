package com.entra21.primeiroprojetospring.model.entity;

import com.entra21.primeiroprojetospring.model.ETipoItem;
import com.entra21.primeiroprojetospring.model.dto.DvdDetalheDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemDetalhesDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name = "dvd")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class DvdEntity extends ItemEntity{

    @Column(name = "diretor")
    private String diretor;

    @Column(name = "duracao")
    private LocalTime duracao;

    @Column(name = "ano_lancamento")
    private Integer anoLancamento;

    @Override
    public ETipoItem getType() {
        return ETipoItem.DVD;
    }

    @Override
    public ItemDetalhesDTO toDTO() {
        DvdDetalheDTO dto = new DvdDetalheDTO();
        dto.setId(this.getId());
        dto.setTitulo(this.getTitulo());
        dto.setEmprestado(this.getEmprestado());
        dto.setValorVenda(this.getValorVenda());
        dto.setValorLocacao(this.getValorLocacao());
        dto.setFranquia(new FranquiaDTO(this.getFranquia()));
        dto.setGeneros(this.getGeneros().stream().map(gen -> {
            GeneroDTO gDTO = new GeneroDTO();
            gDTO.setId(gen.getId());
            gDTO.setNome(gen.getNome());
            return gDTO;
        }).collect(Collectors.toList()));
        dto.setAnoLancamento(this.getAnoLancamento());
        dto.setDiretor(this.getDiretor());
        dto.setDuracao(this.getDuracao());
        dto.setTipo(this.getType());
        return dto;
    }
}
