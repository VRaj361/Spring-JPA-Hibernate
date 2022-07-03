package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public boolean deleteUser(Integer userid) {
		Optional<UserEntity> user=userRepo.findById(userid);
		if(user.isPresent()) {			
			userRepo.deleteById(userid);
			return true;
		}else {
			System.out.println("problem");
			return false;
		}		
	}
	
	@PutMapping
	public boolean updateUser(UserEntity user) {
		Optional<UserEntity> user1=userRepo.findById(user.getUserId());
		if(user1.isPresent()) {			
			userRepo.save(user);
			return true;
		}else {
			System.out.println("problem with id");
			return false;
		}
	}
	
	//user which contain active as true or false
	@GetMapping("/status")
	public List<UserEntity> getAllUserByStatusActivation(@RequestParam("active") Boolean active){
		List<UserEntity> users=userRepo.getAllByStatusActivation(active);
		return users;
	}
	
	
	
}
