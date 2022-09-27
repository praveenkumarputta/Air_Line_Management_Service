package com.GoAir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {

	@Id

	@Column(name = "flightid")
	private Integer flightId;

	@Column(name = "flightname")
	private String flightName;

	@Column(name = "capacity")
	private Integer capacity;

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", capacity=" + capacity + "]";
	}

}