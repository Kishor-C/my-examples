package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.dao.CustomerRepository;
import com.example.dao.TicketRepository;
import com.example.entities.Customer;
import com.example.entities.Ticket;
import com.example.exception.CustomerNotFoundException;
import com.example.service.CustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

	@Mock
	private CustomerRepository customerRepository;

	@Mock
	private TicketRepository ticketRepository;

	@InjectMocks
	private CustomerServiceImpl customerService;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Kishor");
		when(customerRepository.save(any(Customer.class))).thenReturn(customer);
		Customer createdCustomer = customerService.saveCustomer(customer);
		assertEquals("Kishor", createdCustomer.getName());
	}

	@Test
	public void testBookTicketIfCustomerExists() {
		int customerId = 1;

		Customer mockCustomer = new Customer();
		mockCustomer.setCustomerId(customerId);
		mockCustomer.setName("Alice");

		Ticket ticket = new Ticket();
		ticket.setSource("Delhi");
		ticket.setDestination("Mumbai");
		ticket.setDate(LocalDate.now().plusDays(1));

		Ticket savedTicket = new Ticket();
		savedTicket.setTicketId(100);
		savedTicket.setSource("Delhi");
		savedTicket.setDestination("Mumbai");
		savedTicket.setDate(ticket.getDate());
		savedTicket.setCustomer(mockCustomer);

		// Mock behavior
		when(customerRepository.findById(customerId)).thenReturn(Optional.of(mockCustomer));
		when(ticketRepository.save(any(Ticket.class))).thenReturn(savedTicket);

		// Act
		Ticket result = customerService.bookTicket(customerId, ticket);

		// Assert
		assertNotNull(result);
		assertEquals("Delhi", result.getSource());
		assertEquals("Mumbai", result.getDestination());
		assertEquals(mockCustomer, result.getCustomer());

		// Verify interactions
		verify(ticketRepository).save(ticket);
		verify(customerRepository).findById(customerId);
	}

	@Test
	void shouldThrowExceptionWhenCustomerNotFound() {
		// Arrange
		int customerId = 999;
		Ticket ticket = new Ticket();
		ticket.setSource("Delhi");
		ticket.setDestination("Mumbai");
		ticket.setDate(LocalDate.now().plusDays(1));
		when(customerRepository.findById(customerId)).thenReturn(Optional.empty());

		// Act & Assert
		assertThrows(CustomerNotFoundException.class, () -> {
			customerService.bookTicket(customerId, ticket);
		});

		verify(ticketRepository, never()).save(any());
		verify(customerRepository).findById(customerId);
	}

}
