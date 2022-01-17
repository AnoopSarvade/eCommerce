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

import com.example.eCommerce.entity.User;
import com.example.eCommerce.respository.UserRepo;

@RestController
@RequestMapping("/eCommerce")
public class UserController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("/users")
	public List<User> getAllUsers() {

		// List<User> ls = new ArrayList<User>();

		List<User> ls = userRepo.findAll();

		return ls;
		// return userRepo.findAll();
	}

	// optional understanding manually passsing the data
	@GetMapping("/byid")
	public Optional<User> getUserById1() {

		return userRepo.findById(2);
	}

	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable int userId) {
		return userRepo.findById(userId);

	}

	@DeleteMapping("/users/{deleteId}")
	public void deleteById(@PathVariable int deleteId) {
		userRepo.deleteById(deleteId);
	}
	
	@PostMapping("/users")
	public List<User> addUsers(@RequestBody List<User> theUser) {
		return userRepo.saveAll(theUser);
	}
	
	@PutMapping("/users")
	public List<User> updateUsers(@RequestBody List<User> updateUser ) {
		return userRepo.saveAll(updateUser);
	}

	
}

// addUser / updateUser / all method in product /order

/*
 * 
 * @APi is a part of URL ex: /eCommerce/homePage
 * 
 * @Controller
 * 
 * @RequestMapping
 * 
 * @Autowired : connec
 * 
 * Create- POST Read - GET Update - PUT/PATCH Delete - DELETE
 * 
 * 
 * 
 */
