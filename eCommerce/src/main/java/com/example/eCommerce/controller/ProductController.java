package com.example.eCommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.Product;
import com.example.eCommerce.entity.Product;
import com.example.eCommerce.respository.ProductRepo;
import com.example.eCommerce.service.ProductService;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/eCommerce")
public class ProductController {
	
	/*@Autowired
	private ProductRepo productRepo;*/
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		
		List<Product> ls = productService.findAll();
		
		return ls;
		//return
	}
	
	@GetMapping("/products/id")
	public Optional<Product> getProductById1() {

		return productService.findById(2);
	}

	@GetMapping("/products/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productService.findById(id);

	}

	@DeleteMapping("/products/{deleteId}")
	public void deleteById(@PathVariable int deleteId) {
		productService.deleteById(deleteId);
	}
	
	@PostMapping("/products")
	public List<Product> addProducts(@RequestBody List<Product> theProducts) {
		return productService.saveAll(theProducts);
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product theProduct) {
		return productService.save(theProduct);
	}
	
	@PutMapping("/products")
	public List<Product> updateProducts(@RequestBody List<Product> updateProducts ) {
		return productService.saveAll(updateProducts);
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product updateProduct ) {
		return productService.save(updateProduct);
	}
	
}
