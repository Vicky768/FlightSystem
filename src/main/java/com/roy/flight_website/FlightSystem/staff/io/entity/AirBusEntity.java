package com.roy.flight_website.FlightSystem.staff.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="airbus")
public class AirBusEntity implements Serializable{

	private static final long serialVersionUID = 3396714571229686438L;
	
	@Id
	@GeneratedValue
	private long airBusId;
	@Column(nullable=false)
	private String airBusModelName;
	@Column(nullable=false)
	private String airBusModelNumber;
	@Column(nullable=false)
	private String airBusManufacturer;
	@Column(nullable=false)
	private Date dateOfCommission;
	@Column(nullable=false)
	private Date dateOfDecommission;
	@Column(nullable=false)
	private boolean deCommissionStatus;
	@Column(nullable=false)
	private String airBusType;
	@Column(nullable=false)
	private Integer airBusNumberOfSeats;
	
}
