package com.salonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salonservice.bean.Payment;
import com.salonservice.exception.PaymentNotFoundException;
import com.salonservice.service.IPaymentService;

@RestController
public class PaymentController {

		
	@Autowired
		private IPaymentService ipaymentService;
	
		@PostMapping("payment")
		public Payment addPayment(@RequestBody Payment payment) throws PaymentNotFoundException {
			return this.ipaymentService.addPayment(payment);
		}
		@GetMapping("payments")
		public List<Payment> getAllPayment(){
			return this.ipaymentService.getAllPayment();
		}
		@GetMapping("payment/{id}")
		public Payment getpaymentById(@PathVariable("id") Integer paymentId ) throws PaymentNotFoundException {
			return this.ipaymentService.getPaymentById(paymentId);
		}

	}

	

