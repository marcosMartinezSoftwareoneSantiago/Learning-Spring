package com.example.ejercicioonce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejercicioonce.models.entities.Zapato;
import com.example.ejercicioonce.services.ZapatoService;

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

    //<form th:action="@{borrar/${zapato.id}}" method="post">
    @GetMapping("lista-zapatos")
    public String listaZapato(Model model){
        List<Zapato> Zapatos = zapatoService.lista();
        model.addAttribute("zapatos", Zapatos);
        return "eliminar-zapatos";
    }

    @PostMapping("borrar/{id}")
    public String borrarZapato(@PathVariable Long id){
        zapatoService.borrarZapato(id);
        return "redirect:/api/lista-zapatos";
    }
}
