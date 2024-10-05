package com.examples.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.dao.EmployeeDao;
import com.examples.service.Employee;


public class EmployeeDaoImplTest {
	
	private static ApplicationContext context;
	
	private EmployeeDao employeeDao;
	
	@BeforeAll
	public static void load() {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	@AfterAll
	public static void unload() {
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		ctx.close();
	}
	@BeforeEach
	public void set() {
		employeeDao = (EmployeeDao)context.getBean("b2");
	}
	@Test
	public void storeEmployeeTest() {
		Employee employee = new Employee(0, "Raj", 35000);
		Employee employeeStored = employeeDao.save(employee);
		assertTrue(employeeStored.getId() != 0);
		assertTrue(employeeStored.getName().equals(employee.getName()));
	}
	@Test
	public void findEmployeeByIdTest() {
		Employee employee = new Employee(0, "Raj", 35000);
		Employee employeeStored = employeeDao.save(employee);
		Employee employeeFound = employeeDao.findById(employeeStored.getId()).get();
		assertNotNull(employeeFound);
		assertEquals(employeeStored.getId(), employeeFound.getId());
	}
	@Test
	public void findAllEmployeesTest() {
		Employee employee1 = new Employee(0, "Raj", 35000);
		employeeDao.save(employee1);
		Employee employee2 = new Employee(0, "Raj", 35000);
		employeeDao.save(employee2);
		
		List<Employee> list = employeeDao.findAll();
		assertTrue(list.size() >= 2);
	}
}
