package com.qualogy.example.restapi;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class LibraryEndpoint {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/library")
  public Response getAllBooks() {
    List<Book> resource = new ArrayList<>();

    resource.add(new BookBuilder().withName("The Neverending Story")
                                  .withIsbn("0140386335").withAuthor("Michael Ende").build());

    resource.add(new BookBuilder().withName("Elon Musk. Tesla, SpaceX, and the Quest for a Fantastic Future")
                                  .withIsbn("0062469673").withAuthor("Ashlee Vance").build());

    resource.add(new BookBuilder().withName("The Lord of the Rings")
                                  .withIsbn("0007525540").withAuthor("J.R.R. Tolkien").build());
    return Response.ok(resource).build();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/library/{id}")
  public Response getBook(@PathParam("id") String id) {
    Book book = new BookBuilder().withName("The Lord of the Rings")
                                 .withIsbn("0007525540").withAuthor("J.R.R. Tolkien").build();
    return Response.status(Response.Status.OK).entity(book).build();
  }

  @POST
  @Path("/library")
  public Response createBook(Book book) {
    URI uri = null;
    try {
      uri = new URI("/rest/library/" + new Random().nextInt(Integer.MAX_VALUE) + 1);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return Response.created(uri).build();
  }

  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/library/{id}")
  public Response updateBook(Book book) {
    return Response.status(Response.Status.NOT_FOUND).build();
  }

  @DELETE
  @Path("/library/{id}")
  public Response removeBook() {
    return Response.ok().build();
  }

}