/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Accidentvehicule;
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

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("accidentvehicule")
public class AccidentvehiculeFacadeREST extends AbstractFacade<Accidentvehicule> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public AccidentvehiculeFacadeREST() {
        super(Accidentvehicule.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Accidentvehicule entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") BigDecimal id, Accidentvehicule entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") BigDecimal id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Accidentvehicule find(@PathParam("id") BigDecimal id) {
        return super.find(id);
    }

    @GET
   // @Override
    @Produces({"application/xml", "application/json"})
    public List<Accidentvehicule> findAll(@QueryParam("iddamage") BigInteger iddamage, @QueryParam("idgrid") BigInteger idgrid, @QueryParam("accidentdomain") BigInteger accidentdomain,
                                          @QueryParam("classification") String classification) {
        if (iddamage != null && accidentdomain != null && classification != null)
            return em.createNamedQuery("Accidentvehicule.findByDamageAccdomClas").setParameter("iddamage", iddamage).setParameter("idgrid", idgrid).setParameter("accidentdomain", accidentdomain).setParameter("classification", classification).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Accidentvehicule> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
