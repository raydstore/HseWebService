/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.service;

import entity.Users;
import entity.VwUserauthorizationmodule;
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
import javax.ws.rs.core.MediaType;

/**
 *
 * @author boutarfa
 */
@Stateless
@Path("vwuserauthorizationmodule")
public class VwUserauthorizationmoduleFacadeREST extends AbstractFacade<VwUserauthorizationmodule> {

    @PersistenceContext(unitName = "HseWebServicePU")
    private EntityManager em;

    public VwUserauthorizationmoduleFacadeREST() {
        super(VwUserauthorizationmodule.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(VwUserauthorizationmodule entity) {
        super.create(entity);
    }
    
    @POST
    @Path("logon")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public VwUserauthorizationmodule getUsers(@QueryParam("username") String username, @QueryParam("password") String password) {
        if (username != null && password != null)
            return (VwUserauthorizationmodule) em.createNamedQuery("VwUserauthorizationmodule.findByUsernameAndPassword").setParameter("username", username).setParameter("password", password).
                    getResultList().stream().findFirst().orElse(null);
        else return null;
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") BigInteger id, VwUserauthorizationmodule entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") BigInteger id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public VwUserauthorizationmodule find(@PathParam("id") BigInteger id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<VwUserauthorizationmodule> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<VwUserauthorizationmodule> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
