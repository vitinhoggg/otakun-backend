/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otakun.controller;


import com.otakun.dto.AnimeDto;
import com.otakun.service.AnimeService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pichau
 */

@RestController
@RequestMapping("/")
public class AnimeController {
    AnimeService service = new AnimeService();
    @GetMapping
    public List<AnimeDto> getAllAnimes(){
        return service.obterTodosOsAnimes();
    }
}
