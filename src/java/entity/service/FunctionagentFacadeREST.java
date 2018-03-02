/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Functionagent;
import entity.FunctionagentPK;
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
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("functionagent")
public class FunctionagentFacadeREST extends AbstractFacade<Functionagent> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private FunctionagentPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idcaseagent=idcaseagentValue;case1=case1Value'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.FunctionagentPK key = new entity.FunctionagentPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idcaseagent = map.get("idcaseagent");
        if (idcaseagent != null && !idcaseagent.isEmpty()) {
            key.setIdcaseagent(new java.math.BigInteger(idcaseagent.get(0)));
        }
        java.util.List<String> case1 = map.get("case1");
        if (case1 != null && !case1.isEmpty()) {
            key.setCase1(case1.get(0));
        }
        return key;
    }

    public FunctionagentFacadeREST() {
        super(Functionagent.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Functionagent entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Functionagent entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.FunctionagentPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Functionagent find(@PathParam("id") PathSegment id) {
        entity.FunctionagentPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Functionagent> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Functionagent> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
