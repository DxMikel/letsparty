/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.servlet;

import com.letsparty.dao.UsuarioDAOImp;
import com.letsparty.models.Reservacion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mikel
 */
@WebServlet(name="registrarReservacion", urlPatterns = {("/regreservacion")}, asyncSupported = true)
public class registrarReservacion extends HttpServlet{
    
    private List<AsyncContext> contexts = new LinkedList<>();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final AsyncContext asyncContext = req.startAsync(req, resp);
        asyncContext.setTimeout(10 * 60 * 1000);
        contexts.add(asyncContext);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<AsyncContext> asyncContexts = new ArrayList<>(this.contexts);
        this.contexts.clear();
        
        String fechaReservacion = req.getParameter("fecha_reservacion");
        String numeroPersonas = req.getParameter("personasNumero");
        String hora = req.getParameter("horario");
        
        //System.out.println("la fecha de reservacion es: " + fechaReservacion + " el numero de personas es: " + numeroPersonas + " la hora de reservacion es: " + req.getParameter("horario"));
        
        
    }
    
    
    
}
