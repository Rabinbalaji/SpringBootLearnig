package com.tourister.transport;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Transport {

	public Car() {
		System.out.println("Car is initialized");
	}
	
	@Override
	public String getTransport() {
		// TODO Auto-generated method stub
		return "Available transport are 1.Car ,2.Bike, 3.Travels";
	}

	@Override
	public String costOfTheTransportation() {
		// TODO Auto-generated method stub
		return "For car transportation one day charge is 1000 rupees";
	}

}
