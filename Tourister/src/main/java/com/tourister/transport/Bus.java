package com.tourister.transport;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bus implements Transport {

	public Bus() {
		System.out.println("Bus is initialized");
	}
	
	@PostConstruct
	public void doPostContruct() {
		System.out.println("Bean custom initialization");
	}
	
	@PreDestroy
	public void preDestroyBean() {
		System.out.println("Destory our bean instance");
	}
	
	@Override
	public String getTransport() {
		return "Bus tranportation for family trip";
	}

	@Override
	public String costOfTheTransportation() {
		return "50 rupees for per KM";
	}

}
