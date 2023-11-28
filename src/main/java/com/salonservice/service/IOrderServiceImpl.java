package com.salonservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonservice.bean.Order;
import com.salonservice.dao.OrderRepository;
import com.salonservice.exception.OrderNotFoundException;

@Service

public class IOrderServiceImpl implements IOrderService {
	
	

		@Autowired
		private OrderRepository orderRepo;
		
		
		@Override
		public Order addOrder(Order order) throws OrderNotFoundException {
		
			return this.orderRepo.save(order);
		}

		@Override
		public Order updateOrder(Order order) throws OrderNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Order getOrderById(Integer id) throws OrderNotFoundException {
			
			Optional<Order> orderOpt = this.orderRepo.findById(id);
			if(orderOpt.isEmpty())
				throw new OrderNotFoundException("Order Not Found");
			
			return orderOpt.get();
		}

		@Override
		public Order deleteOrderById(Integer id) throws OrderNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Order> getAllOrder() {
			
			return this.orderRepo.findAll();
			}

		@Override
		public Order removeOrder(long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Order updateOrder(long id, Order order) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Order getOrderDetails(long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Order> getAllOrders() {
			// TODO Auto-generated method stub
			return null;
		}
}

