package com.demo.employeeportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.employeeportal.entity.Employee;
import com.demo.employeeportal.repository.EmployeeRepository;

import jakarta.validation.Valid;

@Service
public class EmployeeService {

  private EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public void addEmployee(String name, String address, String title, double salary) {
    Employee employee = new Employee(name, address, title, salary);
    employeeRepository.save(employee);
  }

  public Optional<Employee> findEmployeeById(Long id) {
    return employeeRepository.findById(id);
  }

  public List<Employee> findAllEmployees() {
    return employeeRepository.findAll();
  }

  public void updateEmployee(@Valid Employee employee) {
    employeeRepository.save(employee);
  }

	public void deleteEmployeeById(Long id) {
    employeeRepository.deleteById(id);
	}

}
