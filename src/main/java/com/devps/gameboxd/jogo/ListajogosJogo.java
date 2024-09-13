package com.devps.gameboxd.jogo;

import jakarta.persistence.*;

@Entity
@Table(name = "listajogos_jogos", schema = "gameboxd", indexes = {
        @Index(name = "jogo_id", columnList = "jogo_id")
})
public class ListajogosJogo {
    @EmbeddedId
    private ListajogosJogoId id;

    @MapsId("listaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lista_id", nullable = false)
    private Listajogo lista;

    @MapsId("jogoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jogo_id", nullable = false)
    private Jogo jogo;

    public ListajogosJogoId getId() {
        return id;
    }

    public void setId(ListajogosJogoId id) {
        this.id = id;
    }

    public Listajogo getLista() {
        return lista;
    }

    public void setLista(Listajogo lista) {
        this.lista = lista;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

}