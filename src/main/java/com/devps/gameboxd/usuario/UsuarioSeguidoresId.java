package com.devps.gameboxd.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class UsuarioSeguidoresId implements java.io.Serializable {
    private static final long serialVersionUID = -5428317914239207744L;
    @Column(name = "usuario_id", nullable = false)
    private Integer usuarioId;

    @Column(name = "seguidor_id", nullable = false)
    private Integer seguidorId;

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getSeguidorId() {
        return seguidorId;
    }

    public void setSeguidorId(Integer seguidorId) {
        this.seguidorId = seguidorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioSeguidoresId entity = (UsuarioSeguidoresId) o;
        return Objects.equals(this.seguidorId, entity.seguidorId) &&
                Objects.equals(this.usuarioId, entity.usuarioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seguidorId, usuarioId);
    }

}