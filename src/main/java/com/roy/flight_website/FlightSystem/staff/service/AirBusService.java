package com.roy.flight_website.FlightSystem.staff.service;

import org.springframework.stereotype.Service;

import com.roy.flight_website.FlightSystem.staff.shared.dto.AirBusDto;


public interface AirBusService {
	
	AirBusDto getAirBusById(String id);
	
}
