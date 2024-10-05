package com.org;

import java.util.HashMap;
import java.util.Map;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class EmployeeExceptionMapper implements ExceptionMapper<EmployeeNotFoundException> {

	@Override
	public Response toResponse(EmployeeNotFoundException exception) {
		Map<String, String> map = new HashMap<>();
		map.put("error", exception.getMessage());
		map.put("status", "404");
		return Response.status(404).entity(map).build();
	}

}
