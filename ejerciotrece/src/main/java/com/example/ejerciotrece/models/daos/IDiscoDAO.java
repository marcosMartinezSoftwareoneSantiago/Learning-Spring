package com.example.ejerciotrece.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejerciotrece.models.entities.Disco;

@Repository
public interface IDiscoDAO extends JpaRepository<Disco, Long>{
    public Disco findByTitulo(String titulo);
}

