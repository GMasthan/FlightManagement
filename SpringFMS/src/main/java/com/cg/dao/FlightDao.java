package com.cg.dao;

import java.util.List;

import com.cg.entity.ScheduledFlight;

public interface FlightDao {
	
	public boolean addFlightSchedule(ScheduledFlight schedule);
	public boolean editFlightSchedule(ScheduledFlight schedule);
	public ScheduledFlight viewFlightSchedule(int scheduleId);
	public List<ScheduledFlight> getFlightSchedule(String src, String dest);

}
