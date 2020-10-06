package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.ScheduledFlight;

@Repository
public class FlightDaoImpl implements FlightDao{
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public boolean addFlightSchedule(ScheduledFlight schedule) {
		em.persist(schedule);
		return true;
	}
	@Override
	public boolean editFlightSchedule(ScheduledFlight schedule) {
		em.merge(schedule);
		return true;
	}
	@Override
	public List<ScheduledFlight> getFlightSchedule(String src, String dest) {
		String jpql ="from ScheduledFlight sf inner join fetch sf.sourceAirport s inner join fetch sf.destinationAirport d inner join fetch sf.flight f "
				+ "where s.airportCode=:srcairport and d.airportCode=:destairport ";
		TypedQuery<ScheduledFlight> query = em.createQuery(jpql, ScheduledFlight.class);
		query.setParameter("srcairport", src);
		query.setParameter("destairport", dest);
		
		return query.getResultList();
	}
	@Override
	public ScheduledFlight viewFlightSchedule(int scheduleId) {
		
		return em.find(ScheduledFlight.class, scheduleId);
	}


}