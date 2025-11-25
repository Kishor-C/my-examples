package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Customer;
import com.example.entities.Ticket;
import com.example.exception.CustomerNotFoundException;
import com.example.exception.TicketNotFoundException;
import com.example.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
@CrossOrigin(originPatterns = "*")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> storeCustomer(@Valid @RequestBody Customer customer) {
		Customer savedCustomer = customerService.saveCustomer(customer);
		return ResponseEntity.status(201).body(savedCustomer);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Object> getCustomer(@PathVariable("id") int customerId) {
				
		Customer customer = customerService.getCustomer(customerId);
		return ResponseEntity.status(200).body(customer);

	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable("id") int customerId) {
		
		
			customerService.deleteCustomer(customerId);
			Map<String, String> map = new HashMap<String, String>();
			map.put("message", "Customer with an id "+customerId+" deleted successfully");
			return ResponseEntity.status(201).body(map);
		
	}
	
	@PostMapping("/bookTicket/{id}")
	public ResponseEntity<Object> bookTicket(@PathVariable("id") int customerId, @Valid @RequestBody Ticket ticket) {
		
			Ticket bookedTicket = customerService.bookTicket(customerId, ticket);
			Map<String, String> map = new HashMap<String, String>();
			map.put("message", "Ticket booked, ticket id: "+bookedTicket.getTicketId());
			return ResponseEntity.status(201).body(map);
		
	}
	
	@GetMapping("/ticket/{id}")
	public ResponseEntity<Object> getCustomerFromTicketNo(@PathVariable("id") int ticketId) {
		try {
			Customer customer = customerService.getCustomerFromTicket(ticketId);
			return ResponseEntity.status(201).body(customer);
		} catch (TicketNotFoundException | CustomerNotFoundException e) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("error", e.getMessage());
			return ResponseEntity.status(404).body(map);
		}
	}

	@GetMapping("/tickets/{id}")
	public ResponseEntity<Object> getTickets(@PathVariable("id") int customerId) {
		
			List<Ticket> tickets = customerService.getTickets(customerId);
			return ResponseEntity.status(201).body(tickets);
		
	}
	@PutMapping("/tickets/{id}")
	public ResponseEntity<Object> updateTicket(@PathVariable("id") int ticketId, @RequestBody Ticket ticket) {
			Ticket newTicket = customerService.updateTicket(ticketId, ticket);
			return ResponseEntity.status(201).body(newTicket);
		
	}
	
}
