package com.example.ejercicionueve.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicionueve.model.entity.Zapato;

@Repository
public interface IZapatoDAO extends JpaRepository<Zapato, Long>{
    
}
