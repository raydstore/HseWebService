/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Linkedtask;
import entity.LinkedtaskPK;
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
@Path("linkedtask")
public class LinkedtaskFacadeREST extends AbstractFacade<Linkedtask> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private LinkedtaskPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idparent=idparentValue;idworksheet=idworksheetValue;idchild=idchildValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.LinkedtaskPK key = new entity.LinkedtaskPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idparent = map.get("idparent");
        if (idparent != null && !idparent.isEmpty()) {
            key.setIdparent(new java.math.BigInteger(idparent.get(0)));
        }
        java.util.List<String> idworksheet = map.get("idworksheet");
        if (idworksheet != null && !idworksheet.isEmpty()) {
            key.setIdworksheet(new java.math.BigInteger(idworksheet.get(0)));
        }
        java.util.List<String> idchild = map.get("idchild");
        if (idchild != null && !idchild.isEmpty()) {
            key.setIdchild(new java.math.BigInteger(idchild.get(0)));
        }
        return key;
    }

    public LinkedtaskFacadeREST() {
        super(Linkedtask.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(Linkedtask entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") PathSegment id, Linkedtask entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.LinkedtaskPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Linkedtask find(@PathParam("id") PathSegment id) {
        entity.LinkedtaskPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<Linkedtask> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<Linkedtask> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
