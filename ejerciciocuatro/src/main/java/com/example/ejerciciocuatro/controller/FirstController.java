package com.example.ejerciciocuatro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    
    @GetMapping
    public String unMetodo(){
        return "enlaces";
    }

    @GetMapping("/otro-metodo")
    public String otroMetodo(@RequestParam int id, Model model){
        model.addAttribute("valorId", id);
        return "vistasIds";
    }
}
