package com.qualogy.example.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rest")
public class ExampleEndpoint {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/foo")
  public Response example() {
    return Response.ok("bar").build();
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/weather")
  public Response weatherText() {
    WeatherInfo resource = new WeatherInfo(System.currentTimeMillis());
    return Response.ok(resource.toString()).build();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/weather")
  public Response weatherJson() {
    WeatherInfo resource = new WeatherInfo(System.currentTimeMillis());
    return Response.ok(resource).build();
  }

}