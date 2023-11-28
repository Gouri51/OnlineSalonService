package com.salonservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.salonservice.bean.SalonService;

@Repository
public interface SalonServiceRepository extends JpaRepository<SalonService, Integer> {

	

}
