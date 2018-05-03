/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.VwElementgrid;
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
@Path("vwelementgrid")
public class VwElementgridFacadeREST extends AbstractFacade<VwElementgrid> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public VwElementgridFacadeREST() {
        super(VwElementgrid.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(VwElementgrid entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") BigInteger id, VwElementgrid entity) {
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
    public VwElementgrid find(@PathParam("id") BigInteger id) {
        return super.find(id);
    }

    @GET
    // @Override
    @Produces({"application/xml", "application/json"})
    public List<VwElementgrid> findAll(@QueryParam("idnature") BigInteger idnature) {
        if (idnature != null)
            return em.createNamedQuery("VwElementgrid.findByIdnature").setParameter("idnature", idnature).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<VwElementgrid> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
