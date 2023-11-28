package com.salonservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Customer;
import com.salonservice.bean.CustomerDTO;
import com.salonservice.dao.AddressRespository;
import com.salonservice.dao.CustomerRepository;
import com.salonservice.exception.CustomerNotFoundException;

@Service // @Component
public class ICustomerServiceImpl implements ICustomerService {


		
		@Autowired
		private CustomerRepository customerRepo;
		
		@Autowired
		private AddressRespository addressRepo;
		
		@Override
		public Customer addCustomer(Customer newCustomer) {
			return this.customerRepo.save(newCustomer);
		}

		@Override
		public Customer updateCustomer(CustomerDTO customerDTO) throws CustomerNotFoundException {
			
			Optional<Customer> customerOpt = this.customerRepo.findById(customerDTO.getId());
			if(customerOpt.isEmpty())
				throw new CustomerNotFoundException("Customer id does not exist to update.");
			
			Customer updateCustomer = customerOpt.get();
			updateCustomer.setName(customerDTO.getName());
			updateCustomer.setEmail(customerDTO.getEmail());
			updateCustomer.setContactNo(customerDTO.getContactNo());
			updateCustomer.setPassword(customerDTO.getPassword());
			updateCustomer.setDob(customerDTO.getDob());
			
			
			return this.customerRepo.save(updateCustomer);
		}

		@Override
		public Customer cancelCustomer(Integer customerid) throws CustomerNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> showAllCustomers() {
			
			return this.customerRepo.findAll();
		}

		@Override
		public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Customer> getAllCustomers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean deleteCustomerById(Integer customerId) {
			// TODO Auto-generated method stub
			this.customerRepo.deleteById(customerId);
			return true;
		}

	}