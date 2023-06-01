package com.demo.employeeportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employeeportal.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
