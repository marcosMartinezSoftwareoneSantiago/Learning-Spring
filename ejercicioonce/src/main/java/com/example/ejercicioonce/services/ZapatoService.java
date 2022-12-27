package com.example.ejercicioonce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicioonce.models.daos.IZapatoDAO;
import com.example.ejercicioonce.models.entities.Zapato;

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

    public void borrarZapato(Long id){
        zapatoDao.deleteById(id);
    }
}
