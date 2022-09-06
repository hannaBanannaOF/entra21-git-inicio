package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;

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
}
