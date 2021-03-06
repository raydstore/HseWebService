/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Accidentagenttp;
import entity.AccidentagenttpPK;
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
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("accidentagenttp")
public class AccidentagenttpFacadeREST extends AbstractFacade<Accidentagenttp> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private AccidentagenttpPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;iddamage=iddamageValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.AccidentagenttpPK key = new entity.AccidentagenttpPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.math.BigInteger(id.get(0)));
        }
        java.util.List<String> iddamage = map.get("iddamage");
        if (iddamage != null && !iddamage.isEmpty()) {
            key.setIddamage(new java.math.BigInteger(iddamage.get(0)));
        }
        return key;
    }

    public AccidentagenttpFacadeREST() {
        super(Accidentagenttp.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Accidentagenttp entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Accidentagenttp entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.AccidentagenttpPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Accidentagenttp find(@PathParam("id") PathSegment id) {
        entity.AccidentagenttpPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    // @Override
    @Produces({"application/xml", "application/json"})
    public List<Accidentagenttp> findAll(@QueryParam("iddamage") BigInteger iddamage, @QueryParam("idgrid") BigInteger idgrid) {
        if (iddamage != null)
            return em.createNamedQuery("Accidentagenttp.findByIddamageIdgrid").setParameter("iddamage", iddamage)
                       .setParameter("idgrid", idgrid).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Accidentagenttp> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
