package com.example.ejerciotrece.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejerciotrece.models.entities.Disco;
import com.example.ejerciotrece.services.DiscoService;

@RestController
@RequestMapping("/api/disco")
public class DiscoController {
    
    @Autowired
    private DiscoService discoService;

    @PostMapping("/borrar/{id}")
    public void borrar(@PathVariable Long id){
        this.discoService.borrar(id);
    }

    @GetMapping("buscar-por-titulo/{titulo}")
    public Disco buscar(@PathVariable String titulo){
        Disco disco = this.discoService.findByTitulo(titulo);
        return disco;
    }
}
