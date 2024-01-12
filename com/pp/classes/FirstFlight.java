package com.pp.classes;

import com.pp.target.DeliveryService;

public class FirstFlight implements DeliveryService {

	@Override
	public boolean deliveryService(double amount) {
	
		System.out.println("Courier delivered through FirstFlight and amount paid is " +amount);
		return true;
	}

}
