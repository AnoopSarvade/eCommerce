package com.example.eCommerce.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eCommerce.entity.User;

@Repository     // @Repository (retrive from DB its gives a result, you can manipulate  )
public interface UserRepo extends JpaRepository<User , Integer>{
}
