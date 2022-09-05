package com.entra21.primeiroprojetospring.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "genero")
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
}
