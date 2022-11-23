package com.example.ejercicioocho.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ejercicioocho.dao.IInmuebleDAO;
import com.example.ejercicioocho.entities.Inmueble;

public class InmuebleService {
    
    @Autowired
    private IInmuebleDAO inmuebleDao;

    public void introducir(Inmueble inmueble){
        inmuebleDao.save(inmueble);
    }
}
