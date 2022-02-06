package com.example.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.eCommerce.entity.Order;
import com.example.eCommerce.respository.OrderRepo;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepo orderRepo;

	@Override
	public List<Order> findAll() {
		return orderRepo.findAll();
	}

	@Override
	public Optional<Order> findById(int orderId) {
		return orderRepo.findById(orderId);
	}

	@Override
	public void deleteById(int deleteId) {
		orderRepo.deleteById(deleteId);
	}

	@Override
	public List<Order> saveAll(List<Order> theOrders) {
		return orderRepo.saveAll(theOrders);
	}

	@Override
	public Order save(Order theOrder) {
		return orderRepo.save(theOrder);
	}

}
