/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Caseagent;
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
@Path("caseagent")
public class CaseagentFacadeREST extends AbstractFacade<Caseagent> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public CaseagentFacadeREST() {
        super(Caseagent.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Caseagent entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") BigDecimal id, Caseagent entity) {
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
    public Caseagent find(@PathParam("id") BigDecimal id) {
        return super.find(id);
    }
    
    @GET
    //@Override
    @Produces({"application/xml", "application/json"})
    public List<Caseagent> findAll(@QueryParam("idjobposting") BigInteger idjobposting, @QueryParam("case1") String case1) {
        if (idjobposting != null && case1 != null) {
            return em.createNamedQuery("Caseagent.findByIdjobpostingCase").setParameter("idjobposting", idjobposting).setParameter("case1", case1).getResultList();
         }
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Caseagent> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
