/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.VwNotelementofnatureaccident;
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
@Path("vwnotelementofnatureaccident")
public class VwNotelementofnatureaccidentFacadeREST extends AbstractFacade<VwNotelementofnatureaccident> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public VwNotelementofnatureaccidentFacadeREST() {
        super(VwNotelementofnatureaccident.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(VwNotelementofnatureaccident entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") BigInteger id, VwNotelementofnatureaccident entity) {
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
    public VwNotelementofnatureaccident find(@PathParam("id") BigInteger id) {
        return super.find(id);
    }

    @GET
    //@Override
    @Produces({"application/xml", "application/json"})
    public List<VwNotelementofnatureaccident> findAll(@QueryParam("idaccident") BigInteger idaccident) {
        if (idaccident != null)
            return em.createNamedQuery("VwNotelementofnatureaccident.findByIdaccident").setParameter("idaccident", idaccident).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<VwNotelementofnatureaccident> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
