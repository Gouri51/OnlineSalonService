package com.salonservice.service;

import java.util.List;

import com.salonservice.bean.Order;
import com.salonservice.exception.OrderNotFoundException;

public interface IOrderService {

	public Order addOrder(Order order) throws OrderNotFoundException;
	public Order removeOrder(long id);
	public Order  updateOrder(long id, Order order);
	public Order  getOrderDetails(long id);
	public List<Order> getAllOrders();
	public Order getOrderById(Integer orderId) throws OrderNotFoundException;
	Order updateOrder(Order order) throws OrderNotFoundException;
	Order deleteOrderById(Integer id) throws OrderNotFoundException;
	List<Order> getAllOrder(); 

}

