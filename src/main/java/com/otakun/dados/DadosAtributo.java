/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otakun.dados;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Pichau
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAtributo(
        @JsonAlias("canonicalTitle")
        String titulo,
        @JsonAlias("description")
        String descricao,
        @JsonAlias("posterImage")
        DadosImagem img,
        @JsonAlias("episodeCount")
        Integer totalEpisodios,
        @JsonAlias("episodeLength")
        Integer duracaoEpisodio
        
        ) {

}
