package com.senai.infoa.escola.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.escola.services.EstudanteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping("/count")
    public Long contador() {
        return estudanteService.contador();
    }
    
}
