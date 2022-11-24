package com.example.ejerciciosiete.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejerciciosiete.dao.IJugadorDAO;
import com.example.ejerciciosiete.entities.Jugador;

@Service
public class JugadorService {
    
    @Autowired
    private IJugadorDAO jugadorDao;

    public List<Jugador> lista(){
        return jugadorDao.findAll();
    }
}
