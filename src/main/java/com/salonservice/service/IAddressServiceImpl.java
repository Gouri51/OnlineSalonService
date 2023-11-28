package com.salonservice.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Address;
import com.salonservice.bean.Card;
//import com.salonservice.bean.Card;
import com.salonservice.dao.AddressRespository;
import com.salonservice.exception.AddressNotFoundException;
import com.salonservice.exception.CardNotFoundException;
//import com.salonservice.exception.CardNotFoundException;






@Service
public class IAddressServiceImpl implements IAddressService {

	@Autowired
	private AddressRespository addressRepo;

	@Override
	public Address addAddress(Address address)  throws AddressNotFoundException {
		// TODO Auto-generated method stub
		return this.addressRepo.save(address);
	}

	@Override
	public Address removeAddress(long id) throws AddressNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address updateAddress(long id, Address Address) throws AddressNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Address getAddressDetails(long id) throws AddressNotFoundException {
		Optional<Address> addressOpt = this.addressRepo.findById((int) id);
		if(addressOpt.isEmpty())
			throw new AddressNotFoundException("Address Not Found");
		
		return addressOpt.get();
	}

	@Override
	public List<Address> getAllAddressDetails() {
		// TODO Auto-generated method stub
		return this.addressRepo.findAll();
	}

	@Override
	public boolean deleteAddressById(Integer addressId) {
		this.addressRepo.deleteById(addressId);
		return true;
		
	}

	@Override
	public Address updateAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressDetails1(long id) throws AddressNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card getCardDetails(long id) throws CardNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
