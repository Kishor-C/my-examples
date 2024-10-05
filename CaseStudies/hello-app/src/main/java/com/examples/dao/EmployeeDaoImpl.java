package com.examples.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.examples.service.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> list = new ArrayList<>();
	@Override
	public Employee save(Employee employee) {
		employee.setId(list.size() + 1);
		list.add(employee);
		return employee;
	}

	@Override
	public Optional<Employee> findById(int id) {
		return list.stream().filter(item -> item.getId() == id).findAny();	
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return list;
	}

}
