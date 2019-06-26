/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lesser
 */
@Entity
@Table(schema = "letsparty" , name= "tematica")

public class Tematica {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tematica;
    private String nombre;
    private String descripcion;
    private String tipo_musica;

    public int getId_tematica() {
        return id_tematica;
    }

    public void setId_tematica(int id_tematica) {
        this.id_tematica = id_tematica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_musica() {
        return tipo_musica;
    }

    public void setTipo_musica(String tipo_musica) {
        this.tipo_musica = tipo_musica;
    }

    @Override
    public String toString() {
        return "Tematica{" + "id_tematica=" + id_tematica + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo_musica=" + tipo_musica + '}';
    }
    
    
}
