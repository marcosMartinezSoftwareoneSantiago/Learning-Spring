package com.example.ejerciciodiez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejerciciodiez.model.entity.Zapato;
import com.example.ejerciciodiez.service.ZapatoService;

@Controller
@RequestMapping("/api")
public class ZapatoController {
    
    @Autowired
    private ZapatoService zapatoService;

    @GetMapping("/get-zapato/{id}")
    public String getZapato(@PathVariable Long id, Model model){
        Zapato zapato = zapatoService.findZapato(id);
        model.addAttribute("id", zapato.getId());
        model.addAttribute("marca", zapato.getMarca());
        model.addAttribute("numero", zapato.getNumero());
        model.addAttribute("precio", zapato.getPrecio());
        return "listar-propiedades-zapato";
    }

}
