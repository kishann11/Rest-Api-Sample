package com.kishan.springrest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.springrest.dto.Employee;
import com.kishan.springrest.dtoservice.IEmployeeDto;

@Service
public class EmployeeInformationService implements IEmployeeServiceInt {

	@Autowired
	private IEmployeeDto empdtoservice;
	///List<Employee> elist = new ArrayList<>(Arrays.asList(new Employee(1,"ABC","ISE"),new Employee(2,"BCD","CSE"),new Employee(3,"DEF","EIT")));
	
	@Override
	public List<Employee> getEmployees()
	{
		return empdtoservice.findAll();
	}
	
	@Override
	public Employee getEmployeeById(int empid)
	{
		return empdtoservice.getOne(empid);
	}
	
	@Override
	public void addEmployee(Employee emp)
	{
		empdtoservice.save(emp);
	}
	
	@Override
	public void UpdateEmployee(Employee emp,int empid)
	{
		empdtoservice.save(emp);
	}
	@Override
	public void DeleteEmployee(int empid)
	{
		empdtoservice.deleteById(empid);
	}
}
