package com.salonservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salonservice.bean.Address;



public interface AddressRespository extends JpaRepository<Address, Integer> {

	
}
