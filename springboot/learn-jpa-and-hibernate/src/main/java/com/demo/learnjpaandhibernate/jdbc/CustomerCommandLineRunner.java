package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.customer.Customer;
import com.demo.learnjpaandhibernate.customer.jpa.CustomerJpaRepository;
import com.demo.learnjpaandhibernate.customer.springdatajpa.CustomerSpringDataJpaRepository;

@Component
public class CustomerCommandLineRunner implements CommandLineRunner {

  // @Autowired
  // private CustomerJdbcRepository customerJdbcRepository;

  // @Autowired
  // private CustomerJpaRepository customerJpaRepository;

  @Autowired
  private CustomerSpringDataJpaRepository customerSpringDataJpaRepository;
  
  @Override
  public void run(String... args) throws Exception {
    // customerJdbcRepository.insert(new Customer(1L, "Jack", "Singapore"));
    // customerJdbcRepository.insert(new Customer(2L, "Kim", "New York"));
    // customerJdbcRepository.insert(new Customer(3L, "Peter", "Malaysia"));
    // customerJdbcRepository.deleteById(3L);
    // System.out.println(customerJdbcRepository.findById(1L));

    // customerJpaRepository.insert(new Customer(4L, "Bruce", "Singapore"));
    // customerJpaRepository.insert(new Customer(5L, "Mary", "New York"));
    // customerJpaRepository.insert(new Customer(6L, "John", "Malaysia"));
    // customerJpaRepository.deleteById(6L);
    // System.out.println(customerJpaRepository.findById(4L));

    customerSpringDataJpaRepository.save(new Customer(7L, "Tony", "Singapore"));
    customerSpringDataJpaRepository.save(new Customer(8L, "Sarah", "New York"));
    customerSpringDataJpaRepository.save(new Customer(9L, "Martha", "Malaysia"));
    customerSpringDataJpaRepository.deleteById(9L);
    System.out.println(customerSpringDataJpaRepository.findById(7L));
  }
  
}