package com.org;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import jakarta.ws.rs.GET;

import jakarta.ws.rs.Path;

import jakarta.ws.rs.core.Response;

@Path("/api/myresources")
@Api("/myapi")
@SwaggerDefinition(tags = {@Tag(name="MyApi", description = "My Api Demos")})
public class MyResources {

	@GET
    @Path("/greet")
    @ApiOperation(nickname = "getAdminResource", value = "This returns hello message")
    @ApiResponses(value = {
    		@ApiResponse(code = 200, message = "Just a greet message")
    })
	public Response getAdminResource() {
        return Response.ok("This is a greet resource").build();
    }

  
}
