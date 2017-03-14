package com.iqmsoft.camel.spring.rs.services;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Path("/person")
public class PersonService {

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/home")
	public String home(@DefaultValue("Home") @QueryParam("text") String text) {
		log.info("home");
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/send")
	public String send(@QueryParam("text") String text) {
		log.info("send");
		return null;
	}
	
	
}
