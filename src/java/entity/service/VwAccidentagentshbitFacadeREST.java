/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.VwAccidentagentshbit;
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
@Path("vwaccidentagentshbit")
public class VwAccidentagentshbitFacadeREST extends AbstractFacade<VwAccidentagentshbit> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public VwAccidentagentshbitFacadeREST() {
        super(VwAccidentagentshbit.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(VwAccidentagentshbit entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, VwAccidentagentshbit entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public VwAccidentagentshbit find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
   // @Override
    @Produces({"application/xml", "application/json"})
    public List<VwAccidentagentshbit> findAll(@QueryParam("iddamage") BigInteger iddamage, @QueryParam("idagent") String idagent, @QueryParam("idgrid") BigInteger idgrid) {
        if (iddamage != null && idagent != null)
            return em.createNamedQuery("VwAccidentagentshbit.findByIddamageIdagentIdgrid").setParameter("iddamage", iddamage)
                    .setParameter("idagent", idagent).setParameter("idgrid", idgrid).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<VwAccidentagentshbit> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
