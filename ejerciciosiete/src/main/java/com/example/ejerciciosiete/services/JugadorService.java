package com.example.ejerciciosiete.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ejerciciosiete.dao.IJugadorDAO;
import com.example.ejerciciosiete.entities.Jugador;

public class JugadorService {
    
    @Autowired
    private IJugadorDAO jugadorDao;

    public List<Jugador> lista(){
        return jugadorDao.findAll();
    }
}
