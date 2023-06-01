package com.demo.employeeportal.service;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.entity.Employee;
import com.demo.employeeportal.repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;

@Service
public class EmployeeService {

  private EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  
  
}
