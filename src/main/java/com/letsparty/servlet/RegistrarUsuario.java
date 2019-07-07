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
@WebServlet(name = "RegistrarUsuario", urlPatterns = {("/registro")})
public class RegistrarUsuario extends HttpServlet {
    String apellidoMaterno = "";
    String apellidoPaterno = "";
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Antes de daoimplements");
        UsuarioDAOImp usuario = new UsuarioDAOImp<Usuario>();
        System.out.println("Despues de dao implements");
        resp.setContentType("text/html");
        //String nombre = req.getParameter("username");
        
        String[] apellidos = req.getParameter("usernameApellido").split(" ");
        if (apellidos.length == 2) {
            apellidoPaterno = apellidos[0];
            apellidoMaterno = apellidos[1];
        }
        if (apellidos.length > 2) {
            apellidoPaterno = apellidos[0];
            for (int i = 0; i < apellidos.length; i++) {
                apellidoMaterno += apellidos[i] + " ";
            }
        }

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

        //System.out.println(nuevoUsuario);

        usuario.nuevo(nuevoUsuario);
        resp.sendRedirect("inicio.jsp");
    }

}
