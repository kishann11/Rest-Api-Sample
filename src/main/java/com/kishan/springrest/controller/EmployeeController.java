package com.kishan.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kishan.springrest.dto.*;
import com.kishan.springrest.service.IEmployeeServiceInt;
@RestController
public class EmployeeController {
	@RequestMapping("/welcome")
	public String welcomeEmployee() {
		return "WElcome";
	}
	
	@Autowired
	private IEmployeeServiceInt empService;
	@RequestMapping("/employees")
    public List<Employee> getEmployee()
    {
	return empService.getEmployees();
    }
	
	@RequestMapping("/employees/{empid}")
	public Employee getEmployeeById(@PathVariable int empid)
	{
		return empService.getEmployeeById(empid);
	}
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void PostEmployeeDetails(@RequestBody Employee emp)
	{
		empService.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{empid}")
	public void PutEmployeeDetails(@RequestBody Employee emp,@PathVariable int empid)
	{
		empService.UpdateEmployee(emp,empid);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{empid}")
	public void DeleteEmployeeDetails(@PathVariable int empid)
	{
		empService.DeleteEmployee(empid);
	}
}
