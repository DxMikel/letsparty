/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Lesser
 */
@Entity
@Table(schema = "letsparty" , name= "bar")
public class Bar {
     @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_bar;
    private String nombre;
    private String descripcion;
    private int estatus;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;
    
    private Date horario_abierto;
    private Date horario_cerrado;
    
   
    
    private int id_administrador;
    private int id_tematica;
    private int id_categoria;
    private int id_ubicacion;

    public int getId_bar() {
        return id_bar;
    }

    public void setId_bar(int id_bar) {
        this.id_bar = id_bar;
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

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getHorario_abierto() {
        return horario_abierto;
    }

    public void setHorario_abierto(Date horario_abierto) {
        this.horario_abierto = horario_abierto;
    }

    public Date getHorario_cerrado() {
        return horario_cerrado;
    }

    public void setHorario_cerrado(Date horario_cerrado) {
        this.horario_cerrado = horario_cerrado;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public int getId_tematica() {
        return id_tematica;
    }

    public void setId_tematica(int id_tematica) {
        this.id_tematica = id_tematica;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    @Override
    public String toString() {
        return "Bar{" + "id_bar=" + id_bar + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estatus=" + estatus + ", fecha_registro=" + fecha_registro + ", horario_abierto=" + horario_abierto + ", horario_cerrado=" + horario_cerrado + ", id_administrador=" + id_administrador + ", id_tematica=" + id_tematica + ", id_categoria=" + id_categoria + ", id_ubicacion=" + id_ubicacion + '}';
    }
    
    
    
}
