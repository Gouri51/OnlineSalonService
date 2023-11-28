package com.salonservice.service;

import java.util.List;

import com.salonservice.bean.Card;
import com.salonservice.exception.CardNotFoundException;

public interface ICardService {

	public Card addCard(Card card) throws CardNotFoundException;
	public Card removeCard(long id) throws CardNotFoundException;
	
	public Card getCardDetails(long id) throws CardNotFoundException;
	public List<Card> getAllCardDetails();
	public boolean deleteCardById(Integer cardId);
	Card updateCard(Card card) throws CardNotFoundException;
	
	
}
