package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.AddressEntity;
import com.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired 
	AddressRepository address;
	
	@GetMapping
	public List<AddressEntity> getAddresses() {
		List<AddressEntity> addresses=  address.findAll();
		return addresses;
	}
	
	@PostMapping
	public AddressEntity saveAddress(AddressEntity add) {
		address.save(add);
		return add;
	}
}
