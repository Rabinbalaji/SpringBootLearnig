package com.tourister.transport;

import org.springframework.stereotype.Component;

@Component
public class Car implements Transport {

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
