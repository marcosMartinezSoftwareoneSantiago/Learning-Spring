package com.example.ejerciciosiete.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejerciciosiete.entities.Jugador;

public interface IJugadorDAO extends JpaRepository<Jugador, Long>{
    
}
