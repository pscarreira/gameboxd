package com.devps.gameboxd.usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_seguidores", schema = "gameboxd", indexes = {
        @Index(name = "seguidor_id", columnList = "seguidor_id")
})
public class UsuarioSeguidores {
    @EmbeddedId
    private UsuarioSeguidoresId id;

    @MapsId("usuarioId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @MapsId("seguidorId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "seguidor_id", nullable = false)
    private Usuario seguidor;

    public UsuarioSeguidoresId getId() {
        return id;
    }

    public void setId(UsuarioSeguidoresId id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getSeguidor() {
        return seguidor;
    }

    public void setSeguidor(Usuario seguidor) {
        this.seguidor = seguidor;
    }

}