package com.salonservice.bean;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {

	@Id
	@GeneratedValue
	private Integer paymentId;

	private String status;

	@OneToOne
	private Card card;

	public Payment() {
		super();
	}

	public Payment(Integer paymentId, String status, Card card) {
		super();
		this.paymentId = paymentId;
		this.status = status;
		this.card = card;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

}
