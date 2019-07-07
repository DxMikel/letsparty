/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas.base;

import com.letsparty.models.Categoria;
import com.letsparty.models.Ubicacion;
import com.letsparty.models.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Lesser
 */
public class TestSelectQuery {
private static final String PERSISTENCE_UNIT_NAME = "LetsPartyPU";
    @Test
public void testSelect() {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        Query query = entityManager.createQuery("SELECT ub FROM Ubicacion ub");
        assertNotNull(query);
        List<Ubicacion> ubicaciones = query.getResultList();
        assertFalse(ubicaciones.isEmpty());
        for(Ubicacion ubicacion: ubicaciones){
            System.out.println(ubicacion);
        }
         System.out.println("");
       
      
        Query queryCategoria = entityManager.createQuery("SELECT c FROM Categoria c");
        assertNotNull(queryCategoria);
        List<Categoria> categorias = queryCategoria.getResultList();
        assertFalse(categorias.isEmpty());
        for(Categoria categoria: categorias){
            System.out.println(categoria);
        }
         System.out.println("");
        Ubicacion ubicacion1 = entityManager.find(Ubicacion.class, 1);
        assertNotNull(ubicacion1);
        System.out.println(ubicacion1);

        
       Query queryUsuario = entityManager.createQuery("SELECT u FROM Usuario u where "
               + "u.correo = :correo  AND u.contrasenia= :contrasenia");
       queryUsuario.setParameter("correo", "julioCampos@gmail.com");
                String contrasenia = ("julio12352");
                assertNotNull(queryUsuario);
                queryUsuario.setParameter("contrasenia", contrasenia );
                Usuario usuario = (Usuario) queryUsuario.getSingleResult();
                assertNotNull(usuario);
                System.out.println(usuario);
      
                
                Query queryListaUsuario = entityManager.createQuery("FROM Usuario u");
                assertNotNull(queryListaUsuario);
                List<Usuario> usuarios = queryListaUsuario.getResultList();
                for ( Usuario usuario1 : usuarios){
                    System.out.println(usuario1);
                }
}

    
}
