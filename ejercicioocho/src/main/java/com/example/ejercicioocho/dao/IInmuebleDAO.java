package com.example.ejercicioocho.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicioocho.entities.Inmueble;

@Repository
public interface IInmuebleDAO extends JpaRepository<Inmueble, Long>{
    
}
