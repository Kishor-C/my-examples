package com.org;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;



public class SwaggerConfiguration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setBasePath("/simple-webapp2/webapi");
		beanConfig.setHost("localhost:8080");
		beanConfig.setTitle("Swagger API Demo");
		beanConfig.setResourcePackage("com.org");
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan(true);
		beanConfig.setSchemes(new String[] {"http"});
		beanConfig.setVersion("1.0");
	}

}
