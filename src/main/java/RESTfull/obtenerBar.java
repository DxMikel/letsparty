/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RESTfull;

import com.google.gson.Gson;
import com.letsparty.models.Bar;
import com.letsparty.servicio.respuesta.RespuestaServicio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author mikel
 */
@Path("/bares/consulta/{idBar}")
public class obtenerBar {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerBaar(@PathParam("idBar") int idBar){
         EntityManager entityManager= null ;
        try{
           //System.out.println("servicios4");
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("LetsPartyPU");
                 entityManager = emf.createEntityManager();
        List<Bar> bar = entityManager.createQuery("SELECT b FROM Bar b where b.id_bar = " + idBar)
                .getResultList();
                System.out.println("servicios5");
                
                //se agrego para guardarlo en un json
                String jsonrespuesta= new Gson().toJson(bar);
                return Response.ok().entity(jsonrespuesta).build();
     //   return Response.ok().entity(playlist).build();
        }
        catch(Exception e){
            e.printStackTrace();
            if(entityManager != null){
                if(entityManager.getTransaction() != null){
                    entityManager.getTransaction().rollback();
                }
            }
            RespuestaServicio rs = new RespuestaServicio();
                    rs.setCodigo(0);
                    rs.setMensaje(e.getMessage());
                    System.out.println("servicios6");
            return Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(rs)
                    .build();
        }
    }
}
