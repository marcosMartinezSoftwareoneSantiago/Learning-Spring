package com.example.ejerciciosiete.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ejerciciosiete.services.JugadorService;

@Controller
public class HomeController {
    
    @Autowired
    private JugadorService jugadorService;

    @GetMapping("/lista-jugadores")
    public String getLista(Model model){
        model.addAttribute("jugadores", jugadorService.lista());
        return "jugadoresListados";
    }
}
