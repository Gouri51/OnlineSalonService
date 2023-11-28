package com.salonservice.bean;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class SalonService {

	@Id
	@GeneratedValue
	private Integer serviceId;
	private String serviceName;
	private double price;
	private Double discount;
	private String duration;
	 
	@ManyToOne
	private Appointment appointment;


	public SalonService() {
		super();
	}

	public SalonService(Integer serviceId, String serviceName, double price, Double discount, String duration) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.price = price;
		this.discount = discount;
		this.duration = duration;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setAppointment(Appointment appointment2) {
		// TODO Auto-generated method stub
		
	}

}
