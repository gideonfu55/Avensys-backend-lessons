package com.demo.employeeportal.service;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.repository.EmployeeRepository;

@Service
public class EmployeeService {

  private EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  
  
}
