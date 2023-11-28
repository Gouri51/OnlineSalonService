package com.salonservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salonservice.bean.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

	
}
