package com.temparatureservice.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.temparatureservice.model.Temperature;
import com.temparatureservice.service.TemperatureService;

@Path("/temperature")
public class TemperatureController {

	@Inject
	public TemperatureService temperatureService;
	
	@POST
	@Path("/save-temperature")
	public Response saveTemperature(Temperature temperature) {
		
		Temperature temperatureResponse = temperatureService.saveTemperature(temperature);
		
		return Response.status(Response.Status.CREATED).entity(temperatureResponse).build();
	}
	
	@GET
	@Path("/get-temperature/{temperatureId}")
	public Response getTemperature(@PathParam(value = "temperatureId") Integer temperatureId) {
		
		List<Temperature> temp = temperatureService.getTemperature(temperatureId);
		
		return Response.ok(temp).build();
	}
}
