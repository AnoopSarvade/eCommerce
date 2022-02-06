package com.example.eCommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.eCommerce.entity.User;

public interface UserService{
	
	public List<User> findAll();
	
	public Optional<User> findById(int userId);
	
	public void deleteById(int deleteId);
	
	public List<User> saveAll(List<User> theUser);
	
	public User save(User theuser);
	
	public User login(String username, String password);
	
	public void updateAddress(String address, int userid);

}
