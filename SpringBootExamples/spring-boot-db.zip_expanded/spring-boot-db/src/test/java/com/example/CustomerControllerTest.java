package com.example;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.controller.CustomerController;
import com.example.entities.Customer;
import com.example.entities.Ticket;
import com.example.service.CustomerServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

  	@MockBean
    private CustomerServiceImpl customerService;

    @Test
    public void testCreateTicket() throws Exception {
    	Customer customer = new Customer();
    	customer.setCustomerId(1);
  
        Ticket ticket = new Ticket();
        
        ticket.setSource("Bangalore");
        ticket.setDestination("Chennai");
        ticket.setCustomer(customer);
        
        when(customerService.bookTicket(anyInt(), any(Ticket.class))).thenReturn(ticket);
        mockMvc.perform(post("/customer/bookTicket/1")
        		.contentType(MediaType.APPLICATION_JSON_VALUE)
        		.content(new ObjectMapper().writeValueAsString(ticket)))
        		.andExpect(status().isCreated());
        		
    }
   
}
