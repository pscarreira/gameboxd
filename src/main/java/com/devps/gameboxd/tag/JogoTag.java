package com.devps.gameboxd.tag;

import com.devps.gameboxd.jogo.Jogo;
import jakarta.persistence.*;

@Entity
@Table(name = "jogo_tags", schema = "gameboxd", indexes = {
        @Index(name = "tag_nome", columnList = "tag_nome")
})
public class JogoTag {
    @EmbeddedId
    private JogoTagId id;

    @MapsId("jogoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jogo_id", nullable = false)
    private Jogo jogo;

    @MapsId("tagNome")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tag_nome", nullable = false)
    private Tag tagNome;

    public JogoTagId getId() {
        return id;
    }

    public void setId(JogoTagId id) {
        this.id = id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Tag getTagNome() {
        return tagNome;
    }

    public void setTagNome(Tag tagNome) {
        this.tagNome = tagNome;
    }

}