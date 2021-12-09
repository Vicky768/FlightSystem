package com.roy.flight_website.FlightSystem.staff.ui.controller;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roy.flight_website.FlightSystem.staff.service.AirBusService;
import com.roy.flight_website.FlightSystem.staff.shared.dto.AirBusDto;
import com.roy.flight_website.FlightSystem.staff.ui.model.response.AirBusRest;

@RestController
@RequestMapping("airbus")  //https://localhost:8080/airbus
public class AirBusController {

	private static final Logger logger = LoggerFactory.getLogger(AirBusController.class);
	
	
	@Autowired
	AirBusService airBusService;
	
	
	@GetMapping(path="/info/{id}",produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public AirBusRest getAirbusDetails(@PathVariable String id) {
		
		logger.debug("The ");
		AirBusRest returnValue = new AirBusRest();
		
		AirBusDto airBusDto = airBusService.getAirBusById(id);
		
		returnValue = new ModelMapper().map(airBusDto, AirBusRest.class);
		return returnValue;
	}
	
}
