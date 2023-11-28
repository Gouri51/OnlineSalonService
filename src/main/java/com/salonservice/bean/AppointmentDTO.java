package com.salonservice.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentDTO {

	private Integer appointmentId;
	private String location;
	private String visitType;
	private String preferredService;
	private LocalDate preferredDate;
	private LocalTime preferredTime;
	private AppointmentStatus status=AppointmentStatus.Booked;
	private Double price;
	
	public AppointmentDTO() {
		super();
		
		
	}

	public AppointmentDTO(Integer appointmentId, String location, String visitType, String preferredService,
			LocalDate preferredDate, LocalTime preferredTime, AppointmentStatus status, Double price) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.preferredService = preferredService;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
		this.status = status;
		this.price = price;
		
		
		
		
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

	public AppointmentStatus getStatus() {
		return status;
	}

	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
