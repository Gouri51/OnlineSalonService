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

import com.salonservice.bean.Address;
import com.salonservice.exception.AddressNotFoundException;
import com.salonservice.service.IAddressService;



@RestController
@RequestMapping("v1")
@CrossOrigin(value = "http://localhost:3000/")
public class AddressController {

	@Autowired
	private IAddressService iaddressService;
	
	
	@PostMapping("address")
	public Address addAddress(@RequestBody Address Address) throws AddressNotFoundException {
		return this.iaddressService.addAddress(Address);
		
	}
	
	@PutMapping("address")
	public Address updateAddress(@RequestBody Address address) throws AddressNotFoundException {
		return this.iaddressService.updateAddress(address);
	}
	
	@GetMapping("addresses")
	public List<Address> getAllAddress() {
		return this.iaddressService.getAllAddressDetails();
		
	}
	
	@DeleteMapping("address/{id}")
	public boolean deletePayment(@PathVariable("id") Integer addressId) throws AddressNotFoundException {
		return iaddressService.deleteAddressById(addressId);
	}

	
	@GetMapping("address/{id}")
	public Address getaddressById(@PathVariable("id") Integer addressId) throws AddressNotFoundException {
		return this.iaddressService.getAddressDetails(addressId);

		

	}
	
}
