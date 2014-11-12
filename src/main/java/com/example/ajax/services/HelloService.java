package com.example.ajax.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.ajax.models.Hello;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloService {

	@GET
	public Hello get() {
		Hello hello = new Hello();
		return hello;
	}

}
