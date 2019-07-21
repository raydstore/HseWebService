/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Detailopscardstructure;
import entity.DetailopscardstructurePK;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("detailopscardstructure")
public class DetailopscardstructureFacadeREST extends AbstractFacade<Detailopscardstructure> {

    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private DetailopscardstructurePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idopscard=idopscardValue;idstructure=idstructureValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.DetailopscardstructurePK key = new entity.DetailopscardstructurePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idopscard = map.get("idopscard");
        if (idopscard != null && !idopscard.isEmpty()) {
            key.setIdopscard(new java.math.BigInteger(idopscard.get(0)));
        }
        java.util.List<String> idstructure = map.get("idstructure");
        if (idstructure != null && !idstructure.isEmpty()) {
            key.setIdstructure(new java.math.BigInteger(idstructure.get(0)));
        }
        return key;
    }

    public DetailopscardstructureFacadeREST() {
        super(Detailopscardstructure.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Detailopscardstructure entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, Detailopscardstructure entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.DetailopscardstructurePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Detailopscardstructure find(@PathParam("id") PathSegment id) {
        entity.DetailopscardstructurePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    //@Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Detailopscardstructure> findAll(@QueryParam("idopscard") BigDecimal idopscard) {
        if (idopscard != null)
            return em.createNamedQuery("Detailopscardstructure.findByIdopscard").setParameter("idopscard", idopscard).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Detailopscardstructure> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
