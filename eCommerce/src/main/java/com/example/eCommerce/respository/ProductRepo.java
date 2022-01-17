package com.example.eCommerce.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
