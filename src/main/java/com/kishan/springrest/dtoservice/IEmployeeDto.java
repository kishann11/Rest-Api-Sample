package com.kishan.springrest.dtoservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishan.springrest.dto.Employee;

@Repository
public interface IEmployeeDto extends JpaRepository<Employee,Integer> {

}
