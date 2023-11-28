package com.salonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salonservice.bean.Card;
import com.salonservice.exception.CardNotFoundException;
import com.salonservice.service.ICardService;


@RestController
@RequestMapping("v1")
@CrossOrigin(value = "http://localhost:3000/")
public class CardController {

	@Autowired
	private ICardService icardService;
	
	@PostMapping("card")
	public Card addCard(@RequestBody Card card) throws CardNotFoundException {
		return this.icardService.addCard(card);
		
	}
	
	@PutMapping("card")
	public Card updateCard(@RequestBody Card card) throws CardNotFoundException {
		return this.icardService.updateCard(card);
	}
	
	@GetMapping("cards")
	public List<Card> getAllCardDetails() {
		return this.icardService.getAllCardDetails();
		
	}
	
	@DeleteMapping("card/{id}")
	public boolean deletePayment(@PathVariable("id") Integer cardId) throws CardNotFoundException {
		return icardService.deleteCardById(cardId);
	}

	
	@GetMapping("card/{id}")
	public Card getcardById(@PathVariable("id") Integer cardId ) throws CardNotFoundException {
		return this.icardService.getCardDetails(cardId);

		

	}
	
}
