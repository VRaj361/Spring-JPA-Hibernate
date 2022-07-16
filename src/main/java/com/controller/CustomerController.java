package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.CustomerEntity;
import com.entity.OrderEntity;
import com.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository customerRepo;

	@GetMapping("/addcustomer")
	public String newCustomer() {

		return "AddCustomer";
	}

	@PostMapping("/savecustomer")
	public String saveCustomer(CustomerEntity customer) {
		customerRepo.save(customer);
		return "AddCustomer";
	}

	@GetMapping("/showcustomers")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers",customerRepo.findAll());
		System.out.println(customerRepo.findAll());
		return "ShowAllCustomers";
	}
	
	@GetMapping("/showorders/{customerId}")
	public String showOrders(@PathVariable Integer customerId,Model model) {
		System.out.println("customerId---->"+customerId);
		
		//Optional<CustomerEntity> customer2 = customerRepo.findById(customerId);
		//List<CustomerEntity> customer1=customer2.stream().toList();
		
		List<CustomerEntity> customer1=customerRepo.findByCustomerId(customerId);
		System.out.println(customer1.get(0).getOrders());
		System.out.println(customer1.get(0).getCustomerId());
		model.addAttribute("customer",customer1);
		return "ShowOrders";
	}
}

