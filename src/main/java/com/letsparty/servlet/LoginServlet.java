/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.servlet;

import com.letsparty.dao.UsuarioDAOImp;
import com.letsparty.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author mikel
 */
@WebServlet(name="Login", urlPatterns = {("/loginservlet")})
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    //private final String userEmail = "a";
    //private final String userPass="123";
    private String password = "";
    
    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html");
        PrintWriter print = resp.getWriter();
        //print.println("<h2>Si funciona esta mierda</h2>");
        UsuarioDAOImp getUser = new UsuarioDAOImp<Usuario>();
        System.out.println("se cre la implementacion");
        List<Usuario> usuario= getUser.obtenerTodo(2);
        System.out.println("regrese con la lista");
        for(Usuario algo: usuario){
            print.println("<h3>El nombre del usuario es: " + algo.getNombre() + "</h3>");
            print.println("<h3>la contraseña es: " + algo.getContrasenia()+ "</h3>");
            password = algo.getContrasenia();
        }
        if(BCrypt.checkpw("123", password)){
            print.println("<h1>La contraseña coincide</h1>");
        }else{
            print.println("<h1>La contraseña NO NO NO coincide</h1>");
        }
        //print.println("<h3>El usuario es: "+usuario+"</h3>");
    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String email = req.getParameter("email");
        String pass = req.getParameter("password");
        PrintWriter salida = resp.getWriter();
        
        UsuarioDAOImp getUser = new UsuarioDAOImp<Usuario>();
        List<Usuario> usuario= getUser.login(email);
        
        for(Usuario usuario1: usuario){
            password = usuario1.getContrasenia();
        }
        
        if(BCrypt.checkpw(pass, password)){
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
