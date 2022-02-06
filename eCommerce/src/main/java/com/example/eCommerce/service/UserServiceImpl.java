package com.example.eCommerce.service;

/**
 * Security purpose
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.eCommerce.entity.User;
import com.example.eCommerce.respository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	@Override
	public Optional<User> findById(int userId) {
		return userRepo.findById(userId);
	}

	@Override
	public void deleteById(int deleteId) {
		userRepo.deleteById(deleteId);
	}

	@Override
	public List<User> saveAll(List<User> theUser) {
		return userRepo.saveAll(theUser);
	}

	@Override
	public User save(User theuser) {
		return userRepo.save(theuser);
	}

	@Override
	public User login(String username, String password) {
		return userRepo.login(username, password);
	}

	@Override
	public void updateAddress(String address, int userid) {
		 userRepo.updateAddress(address, userid);
	}

}
