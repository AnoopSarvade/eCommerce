package com.example.eCommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.eCommerce.entity.Order;

public interface OrderService {
	
	
	public List<Order> findAll();
	
	public Optional<Order> findById(int orderId);
	
	public void deleteById(int deleteId);
	
	public List<Order> saveAll(List<Order> theOrders);
	
	public Order save(Order theOrder);

}
