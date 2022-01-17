package com.example.eCommerce.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {  // send entity class connect to DB and primary key 

}
