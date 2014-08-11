package me.earangol.javaee.examples.api;

import me.earangol.javaee.examples.entities.Person;
import me.earangol.javaee.examples.services.spec.PeopleService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

/**
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 *
 * Created with IntelliJ IDEA.
 */
@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
public class PeopleResource {

    @Inject
    private PeopleService peopleService;

    @GET
    public List<Person> listPeople() {
        return peopleService.fetchAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPerson(Person p) {
        peopleService.create(p);
        return Response.created(URI.create("/people/" + p.getId())).entity(p).build();
    }

    @DELETE
    @Path("/{id}")
    public Response removePerson(@PathParam("id") long id) {
        peopleService.remove(id);
        return Response.ok().build();
    }

}