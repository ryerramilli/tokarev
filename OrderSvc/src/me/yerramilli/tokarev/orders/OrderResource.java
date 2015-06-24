package me.yerramilli.tokarev.orders;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import me.yerramilli.tokarev.orders.models.OrderModel;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Path("/orders")
@Api(value = "orders service")
public class OrderResource {
	
	@GET @Path("/ping")
	@ApiOperation("Retreives all active orders")
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		
		return "Hello, There !!! :-)";
		
	}
	
	@GET
	@ApiOperation("Retreives all active orders")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderModel listOrders() {
		
		OrderModel order = new OrderModel();
		order.setOdernumber("Your Orders here :-)");
		return order;
		
	}
	
	@POST
	@ApiOperation("Accepts a new order")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createOrders(OrderModel order) {
		
		return "Order Received";
	}

}
