/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Accidentnature;
import entity.AccidentnaturePK;
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
@Path("accidentnature")
public class AccidentnatureFacadeREST extends AbstractFacade<Accidentnature> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private AccidentnaturePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idaccident=idaccidentValue;idnature=idnatureValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.AccidentnaturePK key = new entity.AccidentnaturePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idaccident = map.get("idaccident");
        if (idaccident != null && !idaccident.isEmpty()) {
            key.setIdaccident(new java.math.BigInteger(idaccident.get(0)));
        }
        java.util.List<String> idnature = map.get("idnature");
        if (idnature != null && !idnature.isEmpty()) {
            key.setIdnature(new java.math.BigInteger(idnature.get(0)));
        }
        return key;
    }

    public AccidentnatureFacadeREST() {
        super(Accidentnature.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Accidentnature entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Accidentnature entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.AccidentnaturePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Accidentnature find(@PathParam("id") PathSegment id) {
        entity.AccidentnaturePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Accidentnature> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Accidentnature> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
