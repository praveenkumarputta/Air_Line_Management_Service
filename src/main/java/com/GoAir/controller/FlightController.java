package com.GoAir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GoAir.model.Flight;
import com.GoAir.service.FlightService;

@RestController

public class FlightController {

	@Autowired
	private FlightService flightService;

	@GetMapping("/getallFlights")
	public List<Flight> getAllFlights() {
		return flightService.getFlightDetails();
	}

	@GetMapping("/getall")
	public List<Flight> getFlights() {
		return flightService.getFlights();
	}

	@PostMapping("/addFlightsData")
	public List<Flight> addAllFlights(@RequestBody List<Flight> flights) {
		return flightService.saveAllFlightsDetails(flights);
	}

	@DeleteMapping("/deleteFlights")
	public String deleteFlight() {
		return flightService.deleteFlight();
	}

	@PutMapping("/updateFlights")
	public Flight updateFlightData(@RequestBody Flight flight) {
		return flightService.updateFlightsData(flight);
	}
}
