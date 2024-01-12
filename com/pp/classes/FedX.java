package com.pp.classes;

import com.pp.target.DeliveryService;

public class FedX  implements DeliveryService {

	@Override
	public boolean deliveryService(double amount) {
		System.out.println("Courier delivered through FedX and amount paid is " +amount);
		return true;
	}

}
