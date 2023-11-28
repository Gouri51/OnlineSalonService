package com.salonservice.bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Appointment {
	@Id
	@GeneratedValue
	private Integer appointmentId;

	private String location;
	private String visitType;
	private String preferredService;
	private LocalDate preferredDate;
	private LocalTime preferredTime;

	@OneToMany
	private List<SalonService> salonservices = new ArrayList<SalonService>();

	@OneToOne
	private Order order;

	public Appointment() {
		super();
	}

	public Appointment(Integer appointmentId, String location, String visitType, String preferredService,
			LocalDate preferredDate, LocalTime preferredTime, List<SalonService> salonservices, Order order) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.preferredService = preferredService;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
		this.salonservices = salonservices;
		this.order = order;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVisitType() {
		return visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	public String getPreferredService() {
		return preferredService;
	}

	public void setPreferredService(String preferredService) {
		this.preferredService = preferredService;
	}

	public LocalDate getPreferredDate() {
		return preferredDate;
	}

	public void setPreferredDate(LocalDate preferredDate) {
		this.preferredDate = preferredDate;
	}

	public LocalTime getPreferredTime() {
		return preferredTime;
	}

	public void setPreferredTime(LocalTime preferredTime) {
		this.preferredTime = preferredTime;
	}

	public List<SalonService> getSalonservices() {
		return salonservices;
	}

	public void setSalonservices(List<SalonService> salonservices) {
		this.salonservices = salonservices;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	

}
