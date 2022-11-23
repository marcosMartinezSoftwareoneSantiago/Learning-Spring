package com.example.ejercicioocho.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ejercicioocho.entities.Inmueble;
import com.example.ejercicioocho.services.InmuebleService;

@Controller
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;
   
    @GetMapping("/formulario")
    public String formulario(Model model){
        model.addAttribute("inmueble", new Inmueble());
        return "formulario";
    }

    @PostMapping("/introducir")
    public String nuevoInmueble(Inmueble inmueble){
        inmuebleService.introducir(inmueble);
        return "redirect:/formulario";
    }

}
