package com.example.ejerciciotres.services;

import java.util.List;

public class Promedio {
    
    public static int promedio(List<Alumno> grupoDeAlumnos){
        int promedio = 0;
        for (Alumno alumno : grupoDeAlumnos) {
            promedio += alumno.getNota();
        }
        promedio /= grupoDeAlumnos.size();
        return promedio;
    }
}
