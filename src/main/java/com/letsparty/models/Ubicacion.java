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
@Table(schema = "letsparty" , name= "ubicacion")

public class Ubicacion {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ubicacion;
    private String calle;
    private String colonia;
    private String codigo_postal;
    private int numero_interior;
    private int numero_exterior;
    private String telefono_bar;
   
    //@Temporal(TemporalType.TIMESTAMP)
    //private Date fecha_registro;

    public int getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public int getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }

    public int getNumero_exterior() {
        return numero_exterior;
    }

    public void setNumero_exterior(int numero_exterior) {
        this.numero_exterior = numero_exterior;
    }

    public String getTelefono_bar() {
        return telefono_bar;
    }

    public void setTelefono_bar(String telefono_bar) {
        this.telefono_bar = telefono_bar;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "id_ubicacion=" + id_ubicacion + ", calle=" + calle + ", colonia=" + colonia + ", codigo_postal=" + codigo_postal + ", numero_interior=" + numero_interior + ", numero_exterior=" + numero_exterior + ", telefono_bar=" + telefono_bar + '}';
    }
    
    

}
