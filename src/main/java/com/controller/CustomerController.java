package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.CustomerEntity;
import com.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository customerRepo;

	@GetMapping("/newcustomer")
	public String newCustomer() {

		return "AddCustomer";
	}

	@PostMapping("/savecustomer")
	public String saveCustomer(CustomerEntity customer) {
		customerRepo.save(customer);
		return "AddCustomer";
	}

	@GetMapping("/customers")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers",customerRepo.findAll());
		System.out.println(customerRepo.findAll());
		return "ShowAllCustomers";
	}
}