/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Property;
import entity.PropertyPK;
// import static entity.PropertyPK_.idobject;
import java.math.BigInteger;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("property")
public class PropertyFacadeREST extends AbstractFacade<Property> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private PropertyPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;idobject=idobjectValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.PropertyPK key = new entity.PropertyPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.math.BigInteger(id.get(0)));
        }
        java.util.List<String> idobject = map.get("idobject");
        if (idobject != null && !idobject.isEmpty()) {
            key.setIdobject(new java.math.BigInteger(idobject.get(0)));
        }
        return key;
    }

    public PropertyFacadeREST() {
        super(Property.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(Property entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") PathSegment id, Property entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.PropertyPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Property find(@PathParam("id") PathSegment id) {
        entity.PropertyPK key = getPrimaryKey(id);
        return super.find(key);
    }
    
    //@DefaultValue("Undefined") 

    @GET
 //   @Override
    @Produces({"application/json"})
    public List<Property> findAll(@QueryParam("idobject") BigInteger idobject) {
        if (idobject != null)
            return em.createNamedQuery("Property.findByIdobject").setParameter("idobject", idobject).getResultList();
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<Property> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
