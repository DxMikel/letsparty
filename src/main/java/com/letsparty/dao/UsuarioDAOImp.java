/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.letsparty.dao;

import com.letsparty.models.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author mikel
 * @param <Usuario>
 */
public class UsuarioDAOImp<Usuario> implements DAO<Usuario> {
    
    private static final String PERSISTENCE_UNIT_NAME = "LetsPartyPU";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private static EntityManager entityManager = emf.createEntityManager();

    public UsuarioDAOImp() {
    }
    @Override
    public List<Usuario> obtenerTodo(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Query query = entityManager.createQuery("from Usuario u where u.id_usuario = :idUsuario");
        query.setParameter("idUsuario", id);
        System.out.println(query);
        List list = query.getResultList();
        //System.out.println(list);
        return list;
    }
    
    @Override
    public List<Usuario> obtenerTodo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Query query = entityManager.createQuery("from usuarios where id_usuario = :idUsuario");
        query.setParameter("idusuario", 2);
        List list = query.getResultList();
        System.out.println(list);
        return list;
    }
    @Override
    public List<Usuario> login(String correo) {
        Query query = entityManager.createQuery("from Usuario u where u.correo = :correoUsuario");
        query.setParameter("correoUsuario", correo);
        //query.setParameter("contrasenia", pass);
        List lista = query.getResultList();
        //System.out.println("la lista es: " + lista);
        return lista;
    }

    @Override
    public Usuario buscar(Usuario id) {
        Query query = entityManager.createQuery("from usuarios where id_usuario = :idUsuario");
        query.setParameter("idusuario", id);
        List list = query.getResultList();
        System.out.println(list);
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nuevo(Usuario t) {
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();
        //entityManager.close();
    }

    @Override
    public void actualizar(Usuario t, String[] parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
