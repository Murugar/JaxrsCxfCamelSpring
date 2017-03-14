package com.iqmsoft.camel.spring.rs.services;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



import lombok.extern.slf4j.Slf4j;


@Slf4j
@Path("/")
public class ExampleService {

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public String home(@DefaultValue("Home") @QueryParam("text") String text) {
		log.debug("home");
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/example/send")
	public String send(@QueryParam("text") String text) {
		log.debug("send");
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/example/sendmessage")
	public String send1(@QueryParam("msg") String text) {
		log.debug("sendmessage");
		return null;
	}
	

}
