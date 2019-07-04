/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas.base;

import com.letsparty.models.Bar;
import com.letsparty.models.Categoria;
import com.letsparty.models.Comentario;
import com.letsparty.models.Producto;
import com.letsparty.models.Reservacion;
import com.letsparty.models.Tematica;
import com.letsparty.models.Ubicacion;
import com.letsparty.models.Usuario;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lesser
 */
public class TestinsertarQuery {
    private static final String PERSISTENCE_UNIT_NAME = "LetsPartyPU";
    
    
    //@Test
       public void testUsuarioQuery(){
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();

        Usuario julio = new Usuario();
         julio.setNombre("Julio");
         julio.setApellido_paterno("Campos");
         julio.setApellido_materno("Lopez");
         julio.setCorreo("julioCampos@gmail.com");
         julio.setContrasenia("julio12352");
         julio.setTipo_usuario(1);
         julio.setTelefono("3353532826");
         julio.setGenero("M");
         julio.setFecha_registro(new Date());
        
         
         System.out.println("Se creo un usuario ");
         
         entityManager.persist(julio);
         assertTrue(julio.getId_usuario() > 0);
         System.out.println("Se persistio un usuario");
                 
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }
     //@Test  
       public void testBarQuery(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
        
        Bar bienvenido_pariente = new Bar();
        bienvenido_pariente.setNombre("Bienvenido Pariente");
        bienvenido_pariente.setDescripcion("Todos tenemos un origen común, todos somos parientes. Somos francos, como nuestra botana, las cervezas y las conversaciones. Aquí todos son bienvenidos.");
        bienvenido_pariente.setFecha_registro(new Date());

        
        //necesita comentario, tematica, ubicacion, categoria, administrador
         bienvenido_pariente.setId_comentario(1);
         bienvenido_pariente.setId_tematica(1);
         bienvenido_pariente.setId_ubicacion(1);
         bienvenido_pariente.setId_categoria(1);
         bienvenido_pariente.setId_administrador(1);
        
        entityManager.persist(bienvenido_pariente);
        assertTrue(bienvenido_pariente.getId_bar() > 0);
        System.out.println("Se creo un bar");
        
        
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }
       //@Test
       public void testTematicaQuery(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
                
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
        
        Tematica perreo = new Tematica();
         perreo.setNombre("Perreo ");
         perreo.setDescripcion("musica de puro perreo ");
         perreo.setTipo_musica("regeton y Perreo");
         
         System.out.println("Se creo un Tematica ");
         
         entityManager.persist(perreo);
         assertTrue(perreo.getId_tematica() > 0);
         System.out.println("Se persistio un Tematica");

        
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }
       //@Test
         public void testUbicacionQuery(){
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
 
        Ubicacion casa = new Ubicacion();
         casa.setCalle("Av. chapulteped");
         casa.setColonia("Americana");
         casa.setCodigo_postal("45080");
         casa.setNumero_interior(10);
         casa.setNumero_exterior(12);
         casa.setTelefono_bar("3353532826");

         System.out.println("Se creo una ubicacion ");
         
         entityManager.persist(casa);
         assertTrue(casa.getId_ubicacion() > 0);
         System.out.println("Se persistio una ubicacion");
                 
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }
   //@Test
         public void testProductoQuery(){
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
 
        
        Producto cerveza = new Producto();
         cerveza.setNombre("Cerveza corona");
         cerveza.setDescripcion("Americana");
         cerveza.setPrecio(10.00f);
         cerveza.setEstatus(1);
         cerveza.setFecha_registro(new Date());
         //necesita la categoria
         //cerveza.setId_categoria(1);
         
         System.out.println("Se creo un producto ");
       
         entityManager.persist(cerveza);
         assertTrue(cerveza.getId_producto() > 0);
         System.out.println("Se persistio un producto");
                 
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }    
    //@Test
    public void testReservacionQuery(){
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
 
        
        Reservacion hoydepeda = new Reservacion();
         hoydepeda.setNumero_personas(10);
         hoydepeda.setEstatus(1);
         hoydepeda.setFecha_registro(new Date());
         //necesita una fecha bien 
         hoydepeda.setFecha_reservacion(new Date());
         //necesita usuario, bar, cover y area
         hoydepeda.setId_usuario(1);
         hoydepeda.setId_bar(1);
         hoydepeda.setId_cover(1);
         hoydepeda.setId_area(1);
         System.out.println("Se creo una reservacion");
       
         entityManager.persist(hoydepeda);
         assertTrue(hoydepeda.getId_reservacion() > 0);
         System.out.println("Se persistio una reservacion");
                 
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }    
    //@Test
    public void testComentarioQuery(){
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
 
        
        Comentario molesto = new Comentario();
         molesto.setCalificacion(10);
         molesto.setEstado(1);
         molesto.setDescripcion("el bar esta bien culero por el servicio");
         molesto.setFecha_registro(new Date());

        
         //necesita usuario, bar
         molesto.setId_usuario(1);
         molesto.setId_bar(1);
         System.out.println("Se creo un comentario ");
       
         entityManager.persist(molesto);
         assertTrue(molesto.getId_comentario() > 0);
         System.out.println("Se persistio un comentario");
                 
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }    
    //@Test
        public void testCategoriaQuery(){
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Se creo un EntityManagerFactory");
        
        EntityManager entityManager = emf.createEntityManager();
        assertNotNull(entityManager);
        System.out.println("Se creo un EntityManager");
        
        entityManager.getTransaction().begin();
 
        
        Categoria Licor = new Categoria();
         Licor.setNombre("Licoes");
         Licor.setDescripcion("Para ponerse bien pedo");
         System.out.println("Se creo una categoria");
       
         entityManager.persist(Licor);
         assertTrue(Licor.getId_categoria() > 0);
         System.out.println("Se persistio una categoria");
                 
        entityManager.getTransaction().commit();
        
       entityManager.close();
       assertFalse(entityManager.isOpen());
        System.out.println("Se cerro con exito");
       
    }    
    
    
}
