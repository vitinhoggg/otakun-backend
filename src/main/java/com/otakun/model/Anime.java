/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otakun.model;
import com.otakun.dados.DadosAtributo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Pichau
 */
@Entity
@Table(name = "anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private Integer totalEpisodios;
    private String poster;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Integer duracaoEpisodio;
    

public Anime() {}

public Anime(DadosAtributo dadosAnimes){
    this.titulo = dadosAnimes.titulo();
    this.totalEpisodios = dadosAnimes.totalEpisodios();
    this.duracaoEpisodio = dadosAnimes.duracaoEpisodio();
    this.descricao = dadosAnimes.descricao();
    this.poster = dadosAnimes.img().linkdaImagem();

}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}



public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
this.titulo = titulo;
}

public Integer getTotalEpisodios() {
    return this.totalEpisodios;
}

public void setTotalEpisodios(Integer totalEpisodios) {
    this.totalEpisodios = totalEpisodios;
}

public String getPoster() {
    return poster;
}

public void setPoster(String poster) {
    this.poster = poster;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String sinopse) {
    this.descricao = sinopse;
}

    @Override
    public String toString() {
        return
            ", titulo='" + this.titulo + '\'' +
            ", totalEpisodios=" + this.totalEpisodios +
            ", poster='" + this.poster + '\'' +
            ", sinopse='" + this.descricao + '\'' +
            ", duracaoEpisodios='" + this.duracaoEpisodio + '\'';
    }
}
