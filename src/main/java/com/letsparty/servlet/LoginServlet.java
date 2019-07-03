/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name="Login", urlPatterns = {("/loginservlet")})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final String userEmail = "a";
    private final String userPass="123";
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter print = resp.getWriter();
        print.println("<h2>Si funciona esta mierda</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String email = req.getParameter("email");
        String pass = req.getParameter("password");
        
        PrintWriter salida = resp.getWriter();
        if (userEmail.equals(email) && userPass.equals(pass)) {
            
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(30*60);
            resp.addCookie(cookie);
            resp.sendRedirect("inicio.jsp");
        }else{
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/index.html");
            salida.println("<font color=red>Correo o contrase&#241;a incorrectas.</font>");
            requestDispatcher.include(req, resp);
        }
    }
    
    
    
}
