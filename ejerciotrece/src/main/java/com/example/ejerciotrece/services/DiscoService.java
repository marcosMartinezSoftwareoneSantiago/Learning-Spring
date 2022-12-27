package com.example.ejerciotrece.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejerciotrece.models.daos.IDiscoDAO;
import com.example.ejerciotrece.models.entities.Disco;

@Service
public class DiscoService {
    
    @Autowired
    private IDiscoDAO discoDao;

    public void borrar(Long id){
        this.discoDao.deleteById(id);
    }

    public Disco findByTitulo(String titulo){
        return this.findByTitulo(titulo);
    }
}
