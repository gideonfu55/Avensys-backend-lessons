package com.demo.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.learnspringboot.pojo.Customer;

@RestController
public class CustomerController {
  
  @RequestMapping("/customers")
  public List<Customer> retrieveCustomers() {
    return Arrays.asList(
      new Customer("001", "Bruce Wayne", "Gotham", 100000),
      new Customer("002", "Tony Stark", "New York", 30000),
      new Customer("003", "Peter Parker", "New York", 2000)
    );
  }

}
