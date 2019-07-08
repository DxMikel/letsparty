/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas.base;

//import com.letsparty.dao.UsuarioDAOImp;
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
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Lesser
 */
public class TestSelectQuery {


    private static final String PERSISTENCE_UNIT_NAME = "LetsPartyPU";
//private static final String PERSISTENCE_UNIT_NAME = "LetsPartyPU";
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    private static EntityManager entityManager = emf.createEntityManager();
    //@Test

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
        for (Ubicacion ubicacion : ubicaciones) {
            System.out.println(ubicacion);
        }
        System.out.println("");

        Query queryCategoria = entityManager.createQuery("SELECT c FROM Categoria c");
        assertNotNull(queryCategoria);
        List<Categoria> categorias = queryCategoria.getResultList();
        assertFalse(categorias.isEmpty());
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getId_categoria());
            System.out.println(categoria.getDescripcion());
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

    //@Test
    public void testBuscar() {
        Query query = entityManager.createQuery("from Usuario u where u.correo = :correoUsuario and u.contrasenia= :contrasenia");
        query.setParameter("correoUsuario", "a@a.com");
        query.setParameter("contrasenia", "$2a$12$aC103ApXMjBxiK73.//BFOyMpB/TvFBjEKOcORmf746/PAp89xdT6");
        boolean algo = BCrypt.checkpw("123", "$2a$12$aC103ApXMjBxiK73.//BFOyMpB/TvFBjEKOcORmf746/PAp89xdT6");
        List list = query.getResultList();
        //System.out.println(list.get(0).toString().);
        assertNotNull(list);
        assertFalse(!algo);
    }

    //@Test
    public void hashPassword() {
        String password = "123";
        // Hash a password for the first time
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hashed);

// gensalt's log_rounds parameter determines the complexity
// the work factor is 2**log_rounds, and the default is 10
        hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
        System.out.println(hashed);

// Check that an unencrypted password matches one that has
// previously been hashed
        if (BCrypt.checkpw("123", hashed)) {
            System.out.println("It matches");
        } else {
            System.out.println("It does not match");
        }
    }
}
