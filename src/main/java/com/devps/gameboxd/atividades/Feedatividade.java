package com.devps.gameboxd.atividades;

import com.devps.gameboxd.usuario.Usuario;
import jakarta.persistence.*;

@Entity
@Table(name = "feedatividade", schema = "gameboxd", indexes = {
        @Index(name = "usuario_id", columnList = "usuario_id")
})
public class Feedatividade {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}