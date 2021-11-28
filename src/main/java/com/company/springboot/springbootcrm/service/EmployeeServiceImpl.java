package com.company.springboot.springbootcrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.springboot.springbootcrm.dao.EmployeeDAO;
import com.company.springboot.springbootcrm.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl (EmployeeDAO theEmployee) {
		this.employeeDAO = theEmployee;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return this.employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		return this.employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		this.employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		this.employeeDAO.deleteById(id);
	}

}
