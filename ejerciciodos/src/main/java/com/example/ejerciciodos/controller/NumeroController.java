package com.example.ejerciciodos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejerciciodos.service.Numero;

@Controller
@RequestMapping("/direccion")
public class NumeroController {
    
    @GetMapping
    public String vista(Model model){
        String numero = String.valueOf(Numero.envioNumero());
        model.addAttribute("numero", numero);
        return "randomView";
    }
    
}
