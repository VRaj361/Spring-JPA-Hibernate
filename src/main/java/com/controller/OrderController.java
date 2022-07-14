package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.CustomerEntity;
import com.entity.OrderEntity;
import com.repository.CustomerRepository;
import com.repository.OrderRepository;

@Controller
public class OrderController {

	@Autowired
	OrderRepository orderRepo;

	@Autowired
	CustomerRepository customerRepo;

	@GetMapping("/addorder")
	public String newOrder(Model model) {
		List<CustomerEntity> customers = customerRepo.findAll();
		model.addAttribute("customers",customers);
		return "AddOrder";
	}

	@PostMapping("/saveorder")
	public String saveOrder(OrderEntity order) {
		System.out.println(order.getTotalAmount());
		System.out.println(order.getCustomer().getCustomerId());
		orderRepo.save(order);
		return "AddOrder";
	}
	
	
}




