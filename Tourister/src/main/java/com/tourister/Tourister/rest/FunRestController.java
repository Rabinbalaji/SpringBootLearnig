package com.tourister.Tourister.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// Access the properties file value
	@Value("${tourister.name}")
	private String touristerName;
	
	@Value("${tourister.visitplace}")
	private String visitPlace;
    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping("/login")
    public String login() {
    	return "Welcome to tourister web";
    }
    
    @GetMapping("/signup")
    public String signup() {
    	return "Welcome to sign up page";
    }
    
    @GetMapping("/getpropertiesvalue")
    public String getPropertiesValue() {
    	return "Tourister Name: " + touristerName + " Place to vist: " + visitPlace;
    }

}