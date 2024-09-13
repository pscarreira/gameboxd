package com.devps.gameboxd.tag;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class JogoTagId implements java.io.Serializable {
    private static final long serialVersionUID = 9201198248373797644L;
    @Column(name = "jogo_id", nullable = false)
    private Integer jogoId;

    @Column(name = "tag_nome", nullable = false)
    private String tagNome;

    public Integer getJogoId() {
        return jogoId;
    }

    public void setJogoId(Integer jogoId) {
        this.jogoId = jogoId;
    }

    public String getTagNome() {
        return tagNome;
    }

    public void setTagNome(String tagNome) {
        this.tagNome = tagNome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JogoTagId entity = (JogoTagId) o;
        return Objects.equals(this.jogoId, entity.jogoId) &&
                Objects.equals(this.tagNome, entity.tagNome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jogoId, tagNome);
    }

}