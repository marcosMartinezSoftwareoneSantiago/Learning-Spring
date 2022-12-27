package com.example.ejercicioonce.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicioonce.models.entities.Zapato;

@Repository
public interface IZapatoDAO extends JpaRepository<Zapato, Long>{
    
}