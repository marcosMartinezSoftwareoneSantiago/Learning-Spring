package com.example.ejerciciocuatro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/formulario", "/usuario-y-email"})
public class SecondController {
    
    @GetMapping
    public String unMetodo(){
        return "formulario";
    }

    @PostMapping("otro-metodo")
    public String otroMetodo(@RequestParam(name="username") String username, @RequestParam(name="email") String email, Model model){
        model.addAttribute("usuario", username);
        model.addAttribute("correo", email);
        return "avista";
    }
}
