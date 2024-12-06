package com.tourister.Tourister.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tourister.transport.Transport;

@RestController
public class Controller {
	private Tourister tourister;
	private Transport transport;
	private Transport prototypeTransport;
	// @ auto wired component tell to spring inject the dependecy
//	@Autowired
//	public Controller(Tourister tourister) {
//		this.tourister = tourister;
//	}
	@Autowired
	public Controller(@Qualifier("bus") Transport transport, @Qualifier("bus") Transport prototypeTransport) {
		// TODO Auto-generated constructor stub
		System.out.println("Demo controller are initialized");
		this.transport = transport;
		this.prototypeTransport = prototypeTransport;
	}
	
	@GetMapping("/places")
	public String getPlaces() {
		return this.tourister.getPlaces();
	}
	
	@GetMapping("/transport")
	public String getTranport() {
		return this.transport.getTransport();
	}
	
	@GetMapping("/cost")
	public String getCost() {
		return this.transport.costOfTheTransportation();
	}
	
	
}
