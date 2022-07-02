package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserEntity;
import com.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepo;

	@PostMapping
	public UserEntity saveUser(UserEntity user) {
		userRepo.save(user);
		return user;
	}

	@GetMapping
	public List<UserEntity> getAllUser() {
		List<UserEntity> users = userRepo.findAll();
		return users;
	}

	@DeleteMapping 
	public void deleteUser(Integer userid) {
		userRepo.deleteById(userid);
				
	}
	
}
