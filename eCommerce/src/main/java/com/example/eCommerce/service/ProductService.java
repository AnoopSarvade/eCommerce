package com.example.eCommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.eCommerce.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Optional<Product> findById(int id);
	
	public void deleteById(int deleteId);
	
	public List<Product> saveAll(List<Product> theProducts);
	
	public Product save(Product theProduct);

}
