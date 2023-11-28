package com.salonservice.bean;

import java.time.LocalDate;

public class OrderDTO {

	private Integer orderId;
	private Double amount;
	private LocalDate billingDate;

	
    public OrderDTO() {
		super();
	}

    public OrderDTO(Integer orderId,Double amount, LocalDate billingDate) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.billingDate = billingDate;
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
}
