package com.pp.target;

public class Amazon {
private DeliveryService service;

public void setService(DeliveryService service) {
	this.service = service;
}

public boolean initiateDelivery(double amount) {
	  return service.deliveryService(amount);
	
}




}
