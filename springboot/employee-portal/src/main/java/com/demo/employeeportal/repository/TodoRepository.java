package com.demo.employeeportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employeeportal.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
  
}
