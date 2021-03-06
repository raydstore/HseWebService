/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.VwDamage;
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
@Path("vwdamage")
public class VwDamageFacadeREST extends AbstractFacade<VwDamage> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public VwDamageFacadeREST() {
        super(VwDamage.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(VwDamage entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") BigInteger id, VwDamage entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") BigInteger id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public VwDamage find(@PathParam("id") BigInteger id) {
        return super.find(id);
    }

    @GET
    //@Override
    @Produces({"application/xml", "application/json"})
    public List<VwDamage> findAll(@QueryParam("idaccident") BigInteger idaccident, @QueryParam("idnature") BigInteger idnature, 
                                  @QueryParam("accidentdomain") BigInteger accidentdomain) {
        if (idaccident != null && idnature != null && accidentdomain != null)
            return em.createNamedQuery("VwDamage.findByAccidentNatureAccidentdomain").setParameter("idaccident", idaccident)
                                     .setParameter("idnature", idnature).setParameter("accidentdomain", accidentdomain).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<VwDamage> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
