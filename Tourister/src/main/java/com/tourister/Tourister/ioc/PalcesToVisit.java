package com.tourister.Tourister.ioc;

import org.springframework.stereotype.Component;

//@ Component make class as a java bean and its available for dependency injection
@Component
public class PalcesToVisit implements Tourister {
	@Override
	public String getPlaces() {
		return "USA,UK,RUSSIA,DUBAI,INDIA,JAPAN";
	}
}
