package com.salonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salonservice.bean.Order;
import com.salonservice.exception.OrderNotFoundException;
import com.salonservice.service.IOrderService;
@RestController
public class OrderController {

	@Autowired
	private IOrderService iorderService;
	
	@PostMapping("order")
	public Order addOrder(@RequestBody Order order) throws OrderNotFoundException {
		return this.iorderService.addOrder(order);
	}
	@GetMapping("orders")
	public List<Order> getAllOrder(){
		return this.iorderService.getAllOrders();
	}
	@GetMapping("order/{id}")
	public  Order getorderById(@PathVariable("id") Integer orderId ) throws OrderNotFoundException {
		return this.iorderService.getOrderById(orderId);
	}
}
