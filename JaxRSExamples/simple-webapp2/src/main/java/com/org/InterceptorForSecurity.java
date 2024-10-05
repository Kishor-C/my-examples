package com.org;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.Provider;

@Provider
public class InterceptorForSecurity implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		List<String> authHeader = requestContext.getHeaders().get("Authorization");
		if(authHeader != null && authHeader.size() > 0) {
			String authString = authHeader.get(0);
			String encryptedString = authString.split(" ")[1];
			byte[] decryptedBytes = Base64.getDecoder().decode(encryptedString);
			String decryptedData = new String(decryptedBytes);
			String[] split = decryptedData.split(":");
			String username = split[0];
			String password = split[1];
			if(username.equals("admin") && password.equals("123")) {
				return;
			}
		}
		Response response = Response.status(Status.UNAUTHORIZED)
				.entity("Access Denied").build();
		requestContext.abortWith(response);
	}
	

}
