package org.acme;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.employeeEntity.EmployeeEntity;
import org.acme.service.EmployeeServiceImpl;

@Path("/controller")
public class ExampleResource {
	@Inject
	EmployeeServiceImpl empService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Quarkus with jpa Repository";
    }
    

    @POST
    @Path("/employee")
    @Transactional
    
    public void save(EmployeeEntity employee) {
	   
	 
	 empService.save(employee);
   }
    
    @GET
    @Path("/employee")
    
    public Response getEmployee(){
    	List<EmployeeEntity>  employee= empService.getEmployeeData();
    	
    	return Response.ok(employee).build();
    }
    
    
}