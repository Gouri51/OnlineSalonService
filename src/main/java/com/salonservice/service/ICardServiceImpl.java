package com.salonservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Card;
import com.salonservice.dao.CardRepository;
import com.salonservice.exception.CardNotFoundException;

@Service
public class ICardServiceImpl implements ICardService{

	@Autowired
	private CardRepository cardRepo;

	@Override
	public Card updateCard(Card card) throws CardNotFoundException {
		
		
		Optional<Card> cardOpt=this.cardRepo.findById(card.getCardId());
		if(cardOpt.isEmpty()) {
			throw new CardNotFoundException("Card id not found");
		}
		Card updateCard=cardOpt.get();
		updateCard.setCardId(card.getCardId());
		updateCard.setCardNumber(card.getCardNumber());
		updateCard.setCardName(card.getCardName());
		updateCard.setCardExpiry(card.getCardExpiry());
		updateCard.setBankName(card.getBankName());
		
		return this.cardRepo.save(updateCard);
		

	}
	@Override
	public Card addCard(Card card)  throws CardNotFoundException {
		// TODO Auto-generated method stub
		return this.cardRepo.save(card);
	}

	@Override
	public Card removeCard(long id) throws CardNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Card getCardDetails(long id) throws CardNotFoundException {
		Optional<Card> cardOpt = this.cardRepo.findById((int) id);
		if(cardOpt.isEmpty())
			throw new CardNotFoundException("Card Not Found");
		
		return cardOpt.get();
	}

	@Override
	public List<Card> getAllCardDetails() {
		// TODO Auto-generated method stub
		return this.cardRepo.findAll();
	}

	@Override
	public boolean deleteCardById(Integer cardId) {
		this.cardRepo.deleteById(cardId);
		return true;
		
	}

	

}
