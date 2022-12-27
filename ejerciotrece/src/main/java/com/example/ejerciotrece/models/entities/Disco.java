package com.example.ejerciotrece.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "tema")
public class Disco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "Titulo")
    private String titulo;

    @Column(name="Autor")
    private String autor;

    @Column(name="Ano")
    private int ano;

    @Column(name="Duracion")
    private int Duracion;

    @Column(name="Imaxe")
    private String imaxe;


    public Disco() {
    }


    public Disco(Long id, String titulo, String autor, int ano, int Duracion, String imaxe) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.Duracion = Duracion;
        this.imaxe = imaxe;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracion() {
        return this.Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getImaxe() {
        return this.imaxe;
    }

    public void setImaxe(String imaxe) {
        this.imaxe = imaxe;
    }
    
}
