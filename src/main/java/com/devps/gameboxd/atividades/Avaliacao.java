package com.devps.gameboxd.atividades;

import com.devps.gameboxd.jogo.Jogo;
import com.devps.gameboxd.usuario.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "avaliacao", schema = "gameboxd", indexes = {
        @Index(name = "autor_id", columnList = "autor_id"),
        @Index(name = "jogo_id", columnList = "jogo_id")
})
public class Avaliacao {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nota")
    private Float nota;

    @Lob
    @Column(name = "comentario")
    private String comentario;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    @Column(name = "curtidas")
    private Integer curtidas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

}