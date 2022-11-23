package com.example.ejercicioocho.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inmueble")
public class Inmueble {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "metros_cuadrados")
    private int metrosCuadrados;

    private int precio;


    public Inmueble() {
    }

    public Inmueble(int metrosCuadrados, int precio) {
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }

    public Long getId() {
        return this.id;
    }

    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
