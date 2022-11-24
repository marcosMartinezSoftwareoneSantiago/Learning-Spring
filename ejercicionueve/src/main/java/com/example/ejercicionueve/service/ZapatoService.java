package com.example.ejercicionueve.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicionueve.model.dao.IZapatoDAO;

@Service
public class ZapatoService {
    
    @Autowired
    private IZapatoDAO zapatoDao;

    
}
