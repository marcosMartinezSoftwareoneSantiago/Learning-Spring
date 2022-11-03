package com.example.ejerciciotres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ejerciciotres.services.Alumno;
import com.example.ejerciciotres.services.Promedio;

@Controller
@RequestMapping({"/", "/alumnado", "/alumnos"})
public class AlumnoController {

    @GetMapping
    public String metodoEnvio(Model model){
        List<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(new Alumno(1, "Paco", "Gutierrez", "Hernandez", 4));
        alumnos.add(new Alumno(2, "Paquito", "Hernandez", "Gutierrez", 6));
        alumnos.add(new Alumno(3, "Farruco", "Ramirez", "Sanchez", 9));

        int promedio = Promedio.promedio(alumnos);
        model.addAttribute("alumnos", alumnos);
        model.addAttribute("nota", promedio);

        return "alumnosView";
    }
}
