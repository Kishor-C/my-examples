package com.examples.dao;

import java.util.List;
import java.util.Optional;

import com.examples.service.Employee;

public interface EmployeeDao {
	public Employee save(Employee employee);
	public Optional<Employee> findById(int id);
	public List<Employee> findAll();
}
