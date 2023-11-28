package com.salonservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salonservice.bean.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
