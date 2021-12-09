package com.roy.flight_website.FlightSystem.staff.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roy.flight_website.FlightSystem.staff.io.entity.AirBusEntity;

@Repository
public interface AirBusRepository extends CrudRepository<AirBusEntity, Long>{
	
	
}
