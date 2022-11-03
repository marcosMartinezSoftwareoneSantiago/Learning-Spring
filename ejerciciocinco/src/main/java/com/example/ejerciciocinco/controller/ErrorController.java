package com.example.ejerciciocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error-usuario")
    public String errorUsuarioLoggin(){
        return "formulario";
    }

    @GetMapping("/error-total")
    public String errorLoggin(){
        return "errors/unauthorized";
    }

}
