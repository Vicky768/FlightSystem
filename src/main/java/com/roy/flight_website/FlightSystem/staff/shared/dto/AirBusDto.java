package com.roy.flight_website.FlightSystem.staff.shared.dto;

import java.io.Serializable;
import java.util.Date;

public class AirBusDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long airBusId;
	
	private String airBusModelName;
	
	private String airBusModelNumber;
	
	private String airBusManufacturer;
	
	private Date dateOfCommission;
	
	private Date dateOfDecommission;
	
	private boolean deCommissionStatus;
	
	private String airBusType;
	
	private Integer airBusNumberOfSeats;

	public long getAirBusId() {
		return airBusId;
	}

	public void setAirBusId(long airBusId) {
		this.airBusId = airBusId;
	}

	public String getAirBusModelName() {
		return airBusModelName;
	}

	public void setAirBusModelName(String airBusModelName) {
		this.airBusModelName = airBusModelName;
	}

	public String getAirBusModelNumber() {
		return airBusModelNumber;
	}

	public void setAirBusModelNumber(String airBusModelNumber) {
		this.airBusModelNumber = airBusModelNumber;
	}

	public String getAirBusManufacturer() {
		return airBusManufacturer;
	}

	public void setAirBusManufacturer(String airBusManufacturer) {
		this.airBusManufacturer = airBusManufacturer;
	}

	public Date getDateOfCommission() {
		return dateOfCommission;
	}

	public void setDateOfCommission(Date dateOfCommission) {
		this.dateOfCommission = dateOfCommission;
	}

	public Date getDateOfDecommission() {
		return dateOfDecommission;
	}

	public void setDateOfDecommission(Date dateOfDecommission) {
		this.dateOfDecommission = dateOfDecommission;
	}

	public boolean isDeCommissionStatus() {
		return deCommissionStatus;
	}

	public void setDeCommissionStatus(boolean deCommissionStatus) {
		this.deCommissionStatus = deCommissionStatus;
	}

	public String getAirBusType() {
		return airBusType;
	}

	public void setAirBusType(String airBusType) {
		this.airBusType = airBusType;
	}

	public Integer getAirBusNumberOfSeats() {
		return airBusNumberOfSeats;
	}

	public void setAirBusNumberOfSeats(Integer airBusNumberOfSeats) {
		this.airBusNumberOfSeats = airBusNumberOfSeats;
	}

	
	
	
}
