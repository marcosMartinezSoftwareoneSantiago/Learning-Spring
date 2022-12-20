package com.example.ejercicionueve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicionueve.model.entity.Zapato;
import com.example.ejercicionueve.service.ZapatoService;

@RestController
@RequestMapping("/api")
public class ZapatosController {
    
    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/get-zapato/{id}")
    public Zapato getZapato(@PathVariable Long id){
        return zapatoService.findZapato(id);
    }

}
