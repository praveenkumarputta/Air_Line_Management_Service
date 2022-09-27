package com.GoAir.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.object.EisOperation;
import org.springframework.stereotype.Service;

import com.GoAir.dao.FlightRepository;
import com.GoAir.model.Flight;

@Service
public class FlightService {

	@Autowired
	private FlightRepository flightRepository;

	public List<Flight> getFlightDetails() {
		return flightRepository.findAll();
	}

	public List<Flight> getFlights() {
		return flightRepository.findAll().stream().sorted(Comparator.comparing(Flight::getFlightName))
				.collect(Collectors.toList());
	}

	public List<Flight> saveAllFlightsDetails(List<Flight> flights) {
		return flightRepository.saveAll(flights);
	}

	public String deleteFlight() {
		flightRepository.deleteAll();
		return "All Flights removed.....!!";
	}

	public Flight updateFlightsData(Flight flight) {
		Flight existingFlight = flightRepository.findById(flight.getFlightId()).orElse(null);

		existingFlight.setCapacity(flight.getCapacity());
		existingFlight.setFlightId(flight.getFlightId());
		existingFlight.setFlightName(flight.getFlightName());
		return flightRepository.save(existingFlight);
	}

}
