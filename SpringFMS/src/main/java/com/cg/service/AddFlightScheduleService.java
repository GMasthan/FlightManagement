package com.cg.service;

import java.util.List;

import com.cg.dto.ScheduleForm;
import com.cg.entity.Airport;
import com.cg.entity.Flight;
import com.cg.entity.ScheduledFlight;
import com.cg.exception.ScheduledFlightIdException;
import com.cg.exception.SeatException;



public interface AddFlightScheduleService {
	
	public boolean addFlightSchedule(ScheduleForm scheduleForm)throws SeatException,ScheduledFlightIdException;
	public boolean editFlightSchedule(ScheduledFlight schedule);
	
	public List<Airport> getAirports();
	
	public List<Flight> getFlights();

}
