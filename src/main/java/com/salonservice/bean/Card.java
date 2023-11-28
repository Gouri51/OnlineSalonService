package com.salonservice.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Card {

	@Id
	@GeneratedValue
	private Integer cardId;
	private String cardName;
	private String cardNumber;
	private LocalDate cardExpiry;
	private String bankName;

	public Card() {
		super();
	}

	public Card(Integer cardId, String cardName, String cardNumber, LocalDate cardExpiry, String bankName) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.cardExpiry = cardExpiry;
		this.bankName = bankName;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(LocalDate cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
