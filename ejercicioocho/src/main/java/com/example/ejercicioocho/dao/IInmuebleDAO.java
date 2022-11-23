package com.example.ejercicioocho.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicioocho.entities.Inmueble;

public interface IInmuebleDAO extends JpaRepository<Inmueble, Long>{
    
}
