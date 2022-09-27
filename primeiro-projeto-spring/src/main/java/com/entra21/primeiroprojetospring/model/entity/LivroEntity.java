package com.entra21.primeiroprojetospring.model.entity;

import com.entra21.primeiroprojetospring.model.ETipoItem;
import com.entra21.primeiroprojetospring.model.dto.*;
import lombok.Data;

import javax.persistence.*;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name = "livro")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class LivroEntity extends ItemEntity{

    @Column(name = "autor")
    private String autor;

    @Column(name = "qtde_paginas")
    private Integer qtdePaginas;

    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;

    @Column(name = "edicao")
    private Integer edicao;

    @Override
    public ETipoItem getType() {
        return ETipoItem.LIVRO;
    }

    @Override
    public ItemDetalhesDTO toDTO() {
        LivroDetalheDTO dto = new LivroDetalheDTO();
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
        dto.setAnoPublicacao(this.getAnoPublicacao());
        dto.setAutor(this.getAutor());
        dto.setEdicao(this.getEdicao());
        dto.setQtdePaginas(this.getQtdePaginas());
        dto.setTipo(this.getType());
        return dto;
    }
}
