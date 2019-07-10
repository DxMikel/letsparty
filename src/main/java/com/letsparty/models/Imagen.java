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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lesser
 */   
@Entity
@Table(schema = "letsparty" , name= "imagenes_bar")
@XmlRootElement
public class Imagen {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_imagen_bar;
    private int id_bar;
    
    private String url;
    private String tipo_imagen;

    public int getId_imagen_bar() {
        return id_imagen_bar;
    }

    public void setId_imagen_bar(int id_imagen_bar) {
        this.id_imagen_bar = id_imagen_bar;
    }

    public int getId_bar() {
        return id_bar;
    }

    public void setId_bar(int id_bar) {
        this.id_bar = id_bar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipo_imagen() {
        return tipo_imagen;
    }

    public void setTipo_imagen(String tipo_imagen) {
        this.tipo_imagen = tipo_imagen;
    }

    @Override
    public String toString() {
        return "Imagen{" + "id_imagen_bar=" + id_imagen_bar + ", id_bar=" + id_bar + ", url=" + url + ", tipo_imagen=" + tipo_imagen + '}';
    }
    
    

}
