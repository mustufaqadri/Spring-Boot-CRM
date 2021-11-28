package com.company.springboot.springbootcrm.dao;

import java.util.List;

import com.company.springboot.springbootcrm.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int id);

}
