/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.models;

import java.util.Date;
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
@Table(schema = "letsparty" , name= "reservacion")
public class Reservacion {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reservacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;
    private int numero_personas;
    private Date fecha_reservacion;
    private int estatus;
     
    private int id_cover;
    private int id_usuario;
    private int id_area;
    private int id_bar;

    public int getId_reservacion() {
        return id_reservacion;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getNumero_personas() {
        return numero_personas;
    }

    public void setNumero_personas(int numero_personas) {
        this.numero_personas = numero_personas;
    }

    public Date getFecha_reservacion() {
        return fecha_reservacion;
    }

    public void setFecha_reservacion(Date fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getId_cover() {
        return id_cover;
    }

    public void setId_cover(int id_cover) {
        this.id_cover = id_cover;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_bar() {
        return id_bar;
    }

    public void setId_bar(int id_bar) {
        this.id_bar = id_bar;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "id_reservacion=" + id_reservacion + ", fecha_registro=" + fecha_registro + ", numero_personas=" + numero_personas + ", fecha_reservacion=" + fecha_reservacion + ", estatus=" + estatus + ", id_cover=" + id_cover + ", id_usuario=" + id_usuario + ", id_area=" + id_area + ", id_bar=" + id_bar + '}';
    }
    

}
