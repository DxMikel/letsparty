/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lesser
 */
public class TestConectionJPAHibernate {
    public static final String PERSISTENCES_UNIT_NAME = "LetsPartyPU";
    
    
    @Test
    public void testConection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCES_UNIT_NAME);
        assertNotNull(emf);
        System.out.println("Creo el EntityManagerFactory");
        EntityManager emanager = emf.createEntityManager();
        assertNotNull(emanager);
        System.out.println("Creo el EntityManager");
        emanager.close();
        assertTrue(!emanager.isOpen());
        System.out.println("Se cerro corectamente");
    }
}
