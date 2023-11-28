package com.salonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salonservice.bean.Customer;
import com.salonservice.bean.CustomerDTO;
import com.salonservice.exception.CustomerNotFoundException;
import com.salonservice.service.ICustomerService;



@RestController
public class CustomerController {

	@Autowired
	private ICustomerService icustomerService;

	@PostMapping("customer")
	public Customer addCustomer(@RequestBody CustomerDTO customerDTO) {

		Customer customer = new Customer(null, customerDTO.getName(), customerDTO.getEmail(), 
				customerDTO.getContactNo(), customerDTO.getPassword(), customerDTO.getDob(), null, null, null);
		return this.icustomerService.addCustomer(customer);
	}

	@PutMapping("customer")
	public Customer updateCustomer(@RequestBody CustomerDTO customerDTO) throws CustomerNotFoundException {
		return this.icustomerService.updateCustomer(customerDTO);
	}

	@DeleteMapping("customer/{customerId}")
	public boolean deleteCustomerById(@PathVariable("customerId")Integer customerId) throws CustomerNotFoundException {
		return this.icustomerService.deleteCustomerById(customerId);
	}
	
	@GetMapping("customers")
	public List<Customer> getAllCustomers() {
		return this.icustomerService.getAllCustomers();
	}
	
	@GetMapping("Customer/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer customerId ) throws CustomerNotFoundException {
		return this.icustomerService.getCustomerById(customerId);
	}
	

}