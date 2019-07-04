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
@Table(schema = "letsparty" , name= "comentario")

public class Comentario {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id_comentario;
    private String descripcion;
    private int calificacion;
    private int estado;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_registro;
    
    private int id_usuario;
    private int id_bar;

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_bar() {
        return id_bar;
    }

    public void setId_bar(int id_bar) {
        this.id_bar = id_bar;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id_comentario=" + id_comentario + ", descripcion=" + descripcion + ", calificacion=" + calificacion + ", estado=" + estado + ", fecha_registro=" + fecha_registro + ", id_usuario=" + id_usuario + ", id_bar=" + id_bar + '}';
    }
    
    
}
