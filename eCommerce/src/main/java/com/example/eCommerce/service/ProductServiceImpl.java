package com.example.eCommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.eCommerce.entity.Product;
import com.example.eCommerce.respository.ProductRepo;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> findById(int id) {
		 return productRepo.findById(id);
	}

	@Override
	public void deleteById(int deleteId) {
		productRepo.deleteById(deleteId);
	}

	@Override
	public List<Product> saveAll(List<Product> theProducts) {
		return productRepo.saveAll(theProducts);
	}

	@Override
	public Product save(Product theProduct) {
		return productRepo.save(theProduct);
	}

}
