package com.example.ejercicioseis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicioseis.models.Coche;
import com.example.ejercicioseis.models.ICocheDAO;

@Service
public class CocheService {
    
    @Autowired
    private ICocheDAO cocheDao;

    public List<Coche> lista(){
        return cocheDao.findAll();
    }

    public void guardar(Coche coche){
        cocheDao.save(coche);
    }
}
