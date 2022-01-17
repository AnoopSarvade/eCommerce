package com.example.eCommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Order;
import com.example.eCommerce.respository.OrderRepo;

@RestController
@RequestMapping("/eCommerce")
public class OrderController {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		
		return orderRepo.findAll();
		
	}

}
