package com.example.eCommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eCommerce.entity.User;
import com.example.eCommerce.respository.UserRepo;
import com.example.eCommerce.service.UserService;

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/eCommerce")
public class UserController {

	/*
	 * @Autowired private UserRepo userRepo;
	 */
	//@Autowired   // field injection
	
	private UserService userService;

	@Autowired    // Constructor iNjection 
	public UserController(UserService theUserService) {
		userService = theUserService;
	}
	@GetMapping("/users")
	public List<User> getAllUsers() {

		// List<User> ls = new ArrayList<User>();

		List<User> ls = userService.findAll();

		return ls;
		// return userRepo.findAll();
	}

	// optional understanding manually passsing the data
	@GetMapping("/users/id")
	public Optional<User> getUserById1() {

		return userService.findById(2);
	}

	@GetMapping("/users/{userId}")
	public Optional<User> getUserById(@PathVariable int userId) {
		return userService.findById(userId);

	}

	@DeleteMapping("/users/{deleteId}")
	public void deleteById(@PathVariable int deleteId) {
		userService.deleteById(deleteId);
	}

	@PostMapping("/users")
	public List<User> addUsers(@RequestBody List<User> theUser) {
		return userService.saveAll(theUser);
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User theuser) {
		return userService.save(theuser);
	}

	@PutMapping("/users")
	public List<User> updateUsers(@RequestBody List<User> updateUser) {
		return userService.saveAll(updateUser);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User updateUser) {
		return userService.save(updateUser);

	}

	@GetMapping("/login")
	public User login(@RequestParam String username, @RequestParam String password) {
		return userService.login(username, password);

	}
	
	@PutMapping("/user/update")
	public void update(@RequestParam int userid ,@RequestParam String address) {
		
		 userService.updateAddress(address, userid);
		// Optional<User> user = userService.findById(userid);
		 
		//return user;
	}

}

// addUser / updateUser / all method in product /order

/*
 * userid and address 
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
