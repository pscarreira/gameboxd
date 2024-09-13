package com.devps.gameboxd.jogo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class ListajogosJogoId implements java.io.Serializable {
    private static final long serialVersionUID = 5949659895787895928L;
    @Column(name = "lista_id", nullable = false)
    private Integer listaId;

    @Column(name = "jogo_id", nullable = false)
    private Integer jogoId;

    public Integer getListaId() {
        return listaId;
    }

    public void setListaId(Integer listaId) {
        this.listaId = listaId;
    }

    public Integer getJogoId() {
        return jogoId;
    }

    public void setJogoId(Integer jogoId) {
        this.jogoId = jogoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ListajogosJogoId entity = (ListajogosJogoId) o;
        return Objects.equals(this.listaId, entity.listaId) &&
                Objects.equals(this.jogoId, entity.jogoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaId, jogoId);
    }

}