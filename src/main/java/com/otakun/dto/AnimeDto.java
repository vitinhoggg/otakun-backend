/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otakun.dto;

/**
 *
 * @author Pichau
 */
public record AnimeDto (
        Long id,
        String titulo,
        String descricao,
        String poster,
        Integer totalEpisodios

        ){
    
}
