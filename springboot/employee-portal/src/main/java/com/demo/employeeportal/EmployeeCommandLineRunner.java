package com.demo.employeeportal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.employeeportal.entity.Employee;
import com.demo.employeeportal.repository.EmployeeRepository;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {

  private EmployeeRepository employeeRepository;

  public EmployeeCommandLineRunner(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    employeeRepository.save(new Employee("John Doe", "123 Ang Mo Kio Street", "Junior Web Developer", 4500.00));
    employeeRepository.save(new Employee("Jane Lim", "456 Yishun Street", "Project Manager", 7000.00));
    employeeRepository.save(new Employee("Muhammad Ali", "134 Kings Street", "Chief Technology Officer", 20000.00));
  }
  
}
