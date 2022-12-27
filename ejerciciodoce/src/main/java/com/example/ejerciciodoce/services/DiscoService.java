package com.example.ejerciciodoce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejerciciodoce.models.dtos.IDiscoDAO;

@Service
public class DiscoService {
    
    @Autowired
    private IDiscoDAO discoDao;

    public void borrar(Long id){
        this.discoDao.deleteById(id);
    }
}
