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
    employeeRepository.save(new Employee(1L, "John Doe", "123 Ang Mo Kio Street", "Junior Web Developer", 4500.00));
    employeeRepository.save(new Employee(2L, "Jane Lim", "456 Yishun Street", "Project Manager", 7000.00));
    employeeRepository.save(new Employee(3L, "Mohammad Ali", "134 Kings Street", "Chief Technology Officer", 20000.00));
  }
  
}
