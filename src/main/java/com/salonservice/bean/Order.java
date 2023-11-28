package com.salonservice.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue
	private Integer orderId;
	private Double amount;
	private LocalDate billingDate;

	private PaymentMethod paymentMethod; // CASH or UPI

	@OneToOne
	private Payment payment;

	@OneToMany
	private List<SalonService> salonservices = new ArrayList<SalonService>();

	public Order() {
		super();
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<SalonService> getSalonservices() {
		return salonservices;
	}

	public void setSalonservices(List<SalonService> salonservices) {
		this.salonservices = salonservices;
	}

	public Order(Integer orderId, Double amount, LocalDate billingDate, PaymentMethod paymentMethod, Payment payment,
			List<SalonService> salonservices) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.billingDate = billingDate;
		this.paymentMethod = paymentMethod;
		this.payment = payment;
		this.salonservices = salonservices;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
