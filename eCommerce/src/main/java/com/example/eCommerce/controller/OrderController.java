package com.example.eCommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Order;
import com.example.eCommerce.respository.OrderRepo;
import com.example.eCommerce.service.OrderService;

@RestController
@RequestMapping("/eCommerce")
public class OrderController {
	
	/*@Autowired
	private OrderRepo orderRepo;*/
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
		
		List<Order> ls = orderService.findAll();
		return ls;
	}
	
	@GetMapping("/orders/id")
	public Optional<Order> getOrderById1() {

		return orderService.findById(1);
	}

	@GetMapping("/orders/{orderId}")
	public Optional<Order> getOrderById(@PathVariable int orderId) {
		return orderService.findById(orderId);

	}

	@DeleteMapping("/orders/{deleteId}")
	public void deleteById(@PathVariable int deleteId) {
		orderService.deleteById(deleteId);
	}
	
	@PostMapping("/orders")
	public List<Order> addOders(@RequestBody List<Order> theOrders) {
		return orderService.saveAll(theOrders);
	}
	
	@PostMapping("/order")
	public Order addOder(@RequestBody Order theOrder) {
		return orderService.save(theOrder);
	}
	
	@PutMapping("/orders")
	public List<Order> updateOrders(@RequestBody List<Order> updateOrders ) {
		return orderService.saveAll(updateOrders);
	}
	
	@PutMapping("/order")
	public Order updateOrder(@RequestBody Order updateOrder ) {
		return orderService.save(updateOrder);
	}

}
