package com.kyol.starter.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("echo")
public class EchoController {

	@GET
	@Produces("text/plain")
	public String echo(@QueryParam("m") String message) {
		return "echo: " + message;
	}
}
