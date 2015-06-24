package me.yerramilli.tokarev.orders.foundation;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class MyApplication extends ResourceConfig {
	
	public MyApplication() {
		
		this.packages("me.yerramilli.tokarev.orders");
		this.packages("com.fasterxml.jackson.jaxrs.json");
		
		this.register(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
        this.register(com.wordnik.swagger.jaxrs.listing.SwaggerSerializers.class);
        
	}
}
