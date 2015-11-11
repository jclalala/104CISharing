package com.medium.SampleMavenProject.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class SampleWebService {
	@GET
	@Path("/testGet")
	@Produces(MediaType.APPLICATION_JSON)
	public String test() {
		return "Test service works!";
	}
}