package com.salonservice.service;

import java.util.List;


import com.salonservice.bean.Customer;
import com.salonservice.bean.CustomerDTO;
import com.salonservice.exception.CustomerNotFoundException;


public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	
	Customer cancelCustomer(Integer customerid) throws CustomerNotFoundException;
	Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;
	List<Customer> showAllCustomers();
	public Customer updateCustomer(CustomerDTO customerDTO) throws CustomerNotFoundException;
	public boolean deleteCustomerById(Integer customerId);
	
}
