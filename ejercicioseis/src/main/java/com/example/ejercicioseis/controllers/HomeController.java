package com.example.ejercicioseis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ejercicioseis.models.Coche;
import com.example.ejercicioseis.services.CocheService;

@Controller
public class HomeController {
    
    @Autowired
    private CocheService cocheService;

    @GetMapping("/recuperar")
    public String recuperar(Model model){
        model.addAttribute("coches", cocheService.lista());
        return "recuperar";
    }

    @GetMapping("/insertar")
    public String insertar(Model model){
        model.addAttribute("coche", new Coche());
        return "insertar";
    }

    @PostMapping("/enviar")
    public String enviar(Coche coche){
        cocheService.guardar(coche);
        return "redirect:/insertar";
    }
}
