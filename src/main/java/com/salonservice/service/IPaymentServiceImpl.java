package com.salonservice.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Card;
import com.salonservice.bean.Payment;
import com.salonservice.bean.PaymentDTO;
import com.salonservice.dao.CardRepository;
import com.salonservice.dao.PaymentRepository;
import com.salonservice.exception.PaymentNotFoundException;

@Service
public class IPaymentServiceImpl implements IPaymentService {
@Autowired
private PaymentRepository paymentRepo;
@Autowired
private CardRepository cardRepo;

@Override
public Payment addPaymentByCid(Payment payment, Integer cid) {
	Optional<Card> cardOpt = this.cardRepo.findById(cid);

	// do the exception handling
	Card card = cardOpt.get();
	payment.setCard(card); // set payment to existing card

	return this.paymentRepo.save(payment);
}

@Override
public Payment getPaymentById(Integer id) throws PaymentNotFoundException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Payment updatePayment(Payment payment) throws PaymentNotFoundException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Payment> getAllPayments() {

	return this.paymentRepo.findAll();
}

@Override
public Payment addPayment(Payment payment) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Payment removePayment(long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Payment updatePayment(long id, Payment payment) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Payment getPaymentDetails(long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Payment> getAllPaymentDetails() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Payment> getAllPayment() {
	// TODO Auto-generated method stub
	return null;


    }


}
