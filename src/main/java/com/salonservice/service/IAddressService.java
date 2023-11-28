package com.salonservice.service;

import java.util.List;

import com.salonservice.bean.Address;
import com.salonservice.bean.Card;
import com.salonservice.exception.AddressNotFoundException;
import com.salonservice.exception.CardNotFoundException;

public interface IAddressService {

	public Address addAddress(Address address) throws AddressNotFoundException;
	public Address removeAddress(long id) throws AddressNotFoundException;
	public Address updateAddress(long id, Address Address) throws AddressNotFoundException;
	public Address getAddressDetails(long id) throws AddressNotFoundException;
	public List<Address> getAllAddressDetails();
	public boolean deleteAddressById(Integer addressId);
	public Address updateAddress(Address address);
	Card getCardDetails(long id) throws CardNotFoundException;
	Address getAddressDetails1(long id) throws AddressNotFoundException;
}

