/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.servlet;

import com.letsparty.dao.DAOImplements;
import com.letsparty.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author mikel
 */
@WebServlet(name = "Registrar Usuario", urlPatterns = {("/registro")})
public class RegistrarUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DAOImplements usuario = new DAOImplements<Usuario>();
        resp.setContentType("text/html");
        //String nombre = req.getParameter("username");
        String[] apellidos = req.getParameter("usernameApellido").split(" ");
        String apellidoPaterno = apellidos[0];
        String apellidoMaterno = apellidos[1];
        String correo = req.getParameter("email");
        String contraseña = BCrypt.hashpw(req.getParameter("password"), BCrypt.gensalt(12));
        String genero = req.getParameter("genero");
        
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(req.getParameter("username"));
        nuevoUsuario.setApellido_paterno(apellidoPaterno);
        nuevoUsuario.setApellido_materno(apellidoMaterno);
        nuevoUsuario.setCorreo(req.getParameter("email"));
        nuevoUsuario.setContrasenia(BCrypt.hashpw(req.getParameter("password"), BCrypt.gensalt(12)));
        nuevoUsuario.setGenero(req.getParameter("genero"));
        nuevoUsuario.setTipo_usuario(1);
        nuevoUsuario.setEstatus(1);
        nuevoUsuario.setFecha_registro(new Date());
        
        System.out.println(nuevoUsuario);
        
        usuario.nuevo();
        
        //resp.sendRedirect("inicio.jsp");
    }
    
    
}
