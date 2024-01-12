package com.pp.main;

import com.pp.classes.BlueDart;
import com.pp.classes.FedX;
import com.pp.classes.FirstFlight;
import com.pp.target.Amazon;
public class LaunchApp 
{

	public static void main(String[] args) 
	{
		Amazon a=new Amazon();
		//FedX ex=new FedX();
		a.setService(new BlueDart());//setter Injection
		
		boolean status=a.initiateDelivery(544.4);
		if(status)
			System.out.println("Order delivered successfully");
		else
			System.out.println("Failed to deliver");
			
        
		
		
		
	}

}




