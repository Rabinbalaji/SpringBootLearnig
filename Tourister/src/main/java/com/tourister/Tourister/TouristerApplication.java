package com.tourister.Tourister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = {"com.tourister.transport", "com.tourister.Tourister.ioc"})
public class TouristerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristerApplication.class, args);
	}
}
