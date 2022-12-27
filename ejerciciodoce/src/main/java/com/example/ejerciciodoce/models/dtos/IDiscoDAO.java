package com.example.ejerciciodoce.models.dtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejerciciodoce.models.entities.Disco;

@Repository
public interface IDiscoDAO extends JpaRepository<Disco, Long>{
    
}
