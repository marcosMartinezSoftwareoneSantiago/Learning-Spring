package com.example.ejerciciodoce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejerciciodoce.services.DiscoService;

@RestController
@RequestMapping("/api/disco")
public class DiscoController {
    
    @Autowired
    private DiscoService discoService;

    @PostMapping("/borrar/{id}")
    private void borrar(@PathVariable Long id){
        this.discoService.borrar(id);
    }

}
