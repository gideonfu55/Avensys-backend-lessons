package com.demo.employeeportal.service;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.employee.Employee;
import com.demo.employeeportal.repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;

@Service
public class EmployeeService {

  private EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public void initializeEmployees() {
    Employee employee1 = new Employee(1L, "John Doe", "Blk 123 Jurong Street", "Junior Web Developer", 4500.00);
    Employee employee2 = new Employee(2L, "Jane Smith", "Blk 124 Ang Mo Kio Street", "Project Manager", 7000.00);

    employeeRepository.save(employee1);
    employeeRepository.save(employee2);
  }
  
}
