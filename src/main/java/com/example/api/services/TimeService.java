package com.example.api.services;

import java.util.TimeZone;

import com.example.api.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    @GET
    @Path("/{timezone}")
    public Time get(@PathParam("timezone") String timezone) {
        return new Time(TimeZone.getTimeZone(timezone.toUpperCase()));
    }

    @GET
    public Time get() {
        return new Time();
    }
    
    @GET
    @Path("/retorna")
    public String retorna() {
    	return "Funciona no heroku";
    }

}

