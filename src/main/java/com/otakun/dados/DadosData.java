/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otakun.dados;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
/**
 *
 * @author Pichau
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosData (
        @JsonAlias("data") List<DadosAnime> data
){}
