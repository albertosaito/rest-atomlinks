package com.alberto.tinkering.rest.atomlinks.resource;

import com.alberto.tinkering.rest.atomlinks.model.Model;

import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * RestAtomLinksResource
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Sep 3, 2015
 *
 */
@Path("/")
@Consumes({ "application/xml", "application/json" })
@Produces({ "application/xml", "application/json" })
public interface RestAtomLinksResource {

    /**
     * Represents getModels
     *
     * @return Collection<Model>
     * @since Sep 3, 2015
     *
     */
    @AddLinks
    @LinkResource(value = Model.class)
    @GET
    @Path("models")
    public Collection<Model> getModels();

    /**
     * Represents addModel
     *
     * @param model
     * @since Sep 3, 2015
     *
     */
    @LinkResource
    @POST
    @Path("models")
    public void addModel(Model model);

    /**
     * Represents getModel
     *
     * @param id
     * @return Model
     * @since Sep 3, 2015
     *
     */
    @AddLinks
    @LinkResource
    @GET
    @Path("model/{id}")
    public Model getModel(@PathParam("id") String id);

    /**
     * Represents updateModel
     *
     * @param id
     * @param model
     * @since Sep 3, 2015
     *
     */
    @LinkResource
    @PUT
    @Path("model/{id}")
    public void updateModel(@PathParam("id") String id, Model model);

    /**
     * Represents deleteModel
     *
     * @param id
     * @since Sep 3, 2015
     *
     */
    @LinkResource(value = Model.class)
    @DELETE
    @Path("model/{id}")
    public void deleteModel(@PathParam("id") String id);

}
