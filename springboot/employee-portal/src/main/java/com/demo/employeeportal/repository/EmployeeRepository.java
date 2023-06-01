package com.demo.employeeportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employeeportal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  
}
