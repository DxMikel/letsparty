/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mikel
 */
@WebServlet(name = "LogOut", urlPatterns = {("/logout")})
public class LogOutServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Cookie cookieActiva = null;
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for(Cookie cooki: cookies){
                if (cooki.getName().equals("email")) {
                    cookieActiva = cooki;
                    break;
                }
            }
        }
        if (cookieActiva != null) {
            cookieActiva.setMaxAge(0);
            resp.addCookie(cookieActiva);
        }
        resp.sendRedirect("index.html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        resp.setContentType("text/html");
        Cookie cookieActiva = null;
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for(Cookie cooki: cookies){
                if (cooki.getName().equals("email")) {
                    cookieActiva = cooki;
                    break;
                }
            }
        }
        if (cookieActiva != null) {
            cookieActiva.setMaxAge(0);
            resp.addCookie(cookieActiva);
        }
        resp.sendRedirect("index.html");
    }
    
    
    
}
