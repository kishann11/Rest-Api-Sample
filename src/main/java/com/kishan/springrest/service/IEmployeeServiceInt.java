package com.kishan.springrest.service;

import java.util.List;

import com.kishan.springrest.dto.Employee;

public interface IEmployeeServiceInt {

	List<Employee>getEmployees();
	
	Employee getEmployeeById(int empid);

	void addEmployee(Employee emp);

	void UpdateEmployee(Employee emp, int empid);

	void DeleteEmployee(int empid);
}
