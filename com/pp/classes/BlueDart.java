package com.pp.classes;

import com.pp.target.DeliveryService;

public class BlueDart  implements DeliveryService {

	@Override
	public boolean deliveryService(double amount) {
		System.out.println("Courier delivered through BlueDart and amount paid is " +amount);
		return true;
	}

}
