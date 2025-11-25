package com.example.service;

import java.util.List;

import com.example.entities.Customer;
import com.example.entities.Ticket;
import com.example.exception.CustomerNotFoundException;
import com.example.exception.TicketNotFoundException;

public interface CustomerService {
	public Customer saveCustomer(Customer customer);
	public void deleteCustomer(int customerId) throws CustomerNotFoundException;
	public Customer getCustomer(int customerId) throws CustomerNotFoundException;
	public Ticket bookTicket(int customerId, Ticket ticket)throws CustomerNotFoundException;
	public void deleteTicket(int ticketId)throws TicketNotFoundException;
	public List<Ticket> getTickets(int customerId)throws CustomerNotFoundException;
	public Ticket getTicket(int ticketId)throws TicketNotFoundException;
	public Customer getCustomerFromTicket(int ticketId) throws TicketNotFoundException, CustomerNotFoundException;
	
	public Ticket updateTicket(int ticketId, Ticket ticket);
}
