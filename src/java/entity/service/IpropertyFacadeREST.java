/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Iproperty;
import entity.IpropertyPK;
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
@Path("iproperty")
public class IpropertyFacadeREST extends AbstractFacade<Iproperty> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private IpropertyPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idinstance=idinstanceValue;idobject=idobjectValue;idproperty=idpropertyValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.IpropertyPK key = new entity.IpropertyPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idinstance = map.get("idinstance");
        if (idinstance != null && !idinstance.isEmpty()) {
            key.setIdinstance(new java.math.BigInteger(idinstance.get(0)));
        }
        java.util.List<String> idobject = map.get("idobject");
        if (idobject != null && !idobject.isEmpty()) {
            key.setIdobject(new java.math.BigInteger(idobject.get(0)));
        }
        java.util.List<String> idproperty = map.get("idproperty");
        if (idproperty != null && !idproperty.isEmpty()) {
            key.setIdproperty(new java.math.BigInteger(idproperty.get(0)));
        }
        return key;
    }

    public IpropertyFacadeREST() {
        super(Iproperty.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(Iproperty entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") PathSegment id, Iproperty entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.IpropertyPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Iproperty find(@PathParam("id") PathSegment id) {
        entity.IpropertyPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<Iproperty> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<Iproperty> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
