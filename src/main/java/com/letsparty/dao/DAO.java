/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.dao;

import java.util.List;

/**
 *
 * @author mikel
 * @param <T>
 */
public interface DAO<T> {
    List<T> obtenerTodo();
    T buscar(T t);
    List<T> login(String correo);
    void nuevo(T t);
    void actualizar(T t, String[] parametros);
    void borrar(T t);
    List<T> obtenerTodo(int id);
    //void nuevo();
}
