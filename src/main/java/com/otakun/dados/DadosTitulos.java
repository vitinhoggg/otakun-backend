/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otakun.dados;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 *
 * @author Pichau
 */
public record DadosTitulos(
    @JsonAlias("en") String en, 
    @JsonAlias("pt") String pt
) {}