package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerRepository;
import com.example.dao.TicketRepository;
import com.example.entities.Customer;
import com.example.entities.Ticket;
import com.example.exception.CustomerNotFoundException;
import com.example.exception.TicketNotFoundException;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository customerDao;
	
	@Autowired
	private TicketRepository ticketDao;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) throws CustomerNotFoundException {
		Customer customer = getCustomer(customerId);
		customerDao.delete(customer);
	}

	@Override
	public Customer getCustomer(int customerId) throws CustomerNotFoundException {
		return customerDao
				.findById(customerId)
				.orElseThrow(()->new CustomerNotFoundException("Customer with an id "+customerId+" not found"));
	}

	@Override
	public Ticket bookTicket(int customerId, Ticket ticket) throws  CustomerNotFoundException {
		Customer customer = getCustomer(customerId);
		ticket.setCustomer(customer);
		return ticketDao.save(ticket);
	}

	@Override
	public void deleteTicket(int ticketId) throws TicketNotFoundException {
		Ticket ticket = getTicket(ticketId);
		ticketDao.delete(ticket);
	}

	@Override
	public List<Ticket> getTickets(int customerId) throws CustomerNotFoundException {
		Customer customer = getCustomer(customerId);
		return customer.getTickets();
	}

	@Override
	public Ticket getTicket(int ticketId) throws TicketNotFoundException {
		return ticketDao
				.findById(ticketId)
				.orElseThrow(()->new TicketNotFoundException("Ticket no. "+ticketId+" not found"));
	}

	@Override
	public Customer getCustomerFromTicket(int ticketId) throws TicketNotFoundException, CustomerNotFoundException {
		Ticket ticket = getTicket(ticketId);
		return ticket.getCustomer();
	}

	@Override
	public Ticket updateTicket(int ticketId, Ticket ticket) {
		Ticket oldTicket = getTicket(ticketId);
		oldTicket.setDate(ticket.getDate());
		oldTicket.setSource(ticket.getSource());
		oldTicket.setDestination(ticket.getDestination());
		ticketDao.save(oldTicket);
		return oldTicket;
	}

	

	
}
