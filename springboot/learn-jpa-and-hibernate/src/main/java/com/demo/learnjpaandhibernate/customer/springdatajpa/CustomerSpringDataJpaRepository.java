package com.demo.learnjpaandhibernate.customer.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learnjpaandhibernate.customer.Customer;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer, Long> {
  
  // This is probably the best way to get all CRUD methods required for a repository in changing database data.

}
