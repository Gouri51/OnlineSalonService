package com.salonservice.bean;


public class PaymentDTO {
	private Integer paymentId;
	private String status;
	private Card card;
    public PaymentDTO() {
	super();
}

	public Integer getPymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public PaymentDTO(Integer paymentId, String status, Card card) {
		super();
		this.paymentId = paymentId;
		this.setStatus(status);
		this.setCard(card);
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

	public String getPaymentId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getCardId() {
		// TODO Auto-generated method stub
		return null;
	}

}


