package com.demo.employeeportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.entity.Employee;
import com.demo.employeeportal.repository.EmployeeRepository;

@Service
public class EmployeeService {

  private EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Employee> findAllEmployees() {
    return employeeRepository.findAll();
  }

  public void addEmployee(String name, String address, String title, double salary) {
    Employee employee = new Employee(name, address, title, salary);
    employeeRepository.save(employee);
  }
  
}
