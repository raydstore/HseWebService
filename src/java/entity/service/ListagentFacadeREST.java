/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Listagent;
import entity.ListagentPK;
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
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("listagent")
public class ListagentFacadeREST extends AbstractFacade<Listagent> {
    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    private ListagentPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idjobposting=idjobpostingValue;idagent=idagentValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entity.ListagentPK key = new entity.ListagentPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idjobposting = map.get("idjobposting");
        if (idjobposting != null && !idjobposting.isEmpty()) {
            key.setIdjobposting(new java.math.BigInteger(idjobposting.get(0)));
        }
        java.util.List<String> idagent = map.get("idagent");
        if (idagent != null && !idagent.isEmpty()) {
            key.setIdagent(idagent.get(0));
        }
        return key;
    }

    public ListagentFacadeREST() {
        super(Listagent.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Listagent entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Listagent entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entity.ListagentPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Listagent find(@PathParam("id") PathSegment id) {
        entity.ListagentPK key = getPrimaryKey(id);
        return super.find(key);
    }
    
    @GET
    //@Override
    @Produces({"application/xml", "application/json"})
    public List<Listagent> findAll(@QueryParam("idjobposting") BigInteger idjobposting) {
        if (idjobposting != null) {
            return em.createNamedQuery("Listagent.findByIdjobposting").setParameter("idjobposting", idjobposting).getResultList();
         }
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Listagent> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
