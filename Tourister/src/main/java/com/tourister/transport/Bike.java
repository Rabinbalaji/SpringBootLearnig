package com.tourister.transport;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // its not needed if lazy initialization is declare globaly(properties file)
public class Bike implements Transport {

	public Bike() {
		System.out.println("Bike is Initialized");	
	}
	
	@Override
	public String getTransport() {
		return "Bike transportation for bike lovers";
	}

	@Override
	public String costOfTheTransportation() {
		return "Only 500 rupees for one day";
	}

}
