package com.example.ejerciciodiez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejerciciodiez.model.dao.IZapatoDAO;
import com.example.ejerciciodiez.model.entity.Zapato;

@Service
public class ZapatoService {
    
    @Autowired
    private IZapatoDAO zapatoDao;

    public List<Zapato> lista(){
        return zapatoDao.findAll();
    }

    public Zapato findZapato(Long id){
        return zapatoDao.findById(id).orElse(null);
    }
}