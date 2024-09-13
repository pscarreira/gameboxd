package com.devps.gameboxd.tag;

import jakarta.persistence.*;

@Entity
@Table(name = "tag", schema = "gameboxd")
public class Tag {
    @Id
    @Column(name = "nome", nullable = false)
    private String nome;

    @Lob
    @Column(name = "descricao")
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}