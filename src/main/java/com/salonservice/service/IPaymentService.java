package com.salonservice.service;

import java.util.List;

import com.salonservice.bean.Payment;
import com.salonservice.bean.PaymentDTO;
import com.salonservice.exception.PaymentNotFoundException;

public interface IPaymentService {

	public Payment addPayment(Payment payment);
	public Payment removePayment(long id);
	public Payment updatePayment(long id, Payment payment);
	public Payment getPaymentDetails(long id);
	public List<Payment> getAllPaymentDetails();
	public Payment getPaymentById(Integer paymentId) throws PaymentNotFoundException;
	Payment updatePayment(Payment payment) throws PaymentNotFoundException;
	Payment addPaymentByCid(Payment payment, Integer cid);
	List<Payment> getAllPayments();
	public List<Payment> getAllPayment();
	
}
