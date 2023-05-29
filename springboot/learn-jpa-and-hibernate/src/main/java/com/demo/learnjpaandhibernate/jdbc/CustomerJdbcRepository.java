package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.customer.Customer;

@Repository
public class CustomerJdbcRepository {
  
  @Autowired
  private JdbcTemplate springJdbcTemplate;

  private static String INSERT_QUERY = "INSERT INTO CUSTOMER(id, name, address)\nVALUES(?, ?, ?)";
  private static String DELETE_QUERY = "DELETE from CUSTOMER where id = ?";
  private static String SELECT_QUERY = "SELECT * from CUSTOMER where id = ?";

  public void insert(Customer customer) {
    springJdbcTemplate.update(INSERT_QUERY, customer.getId(), customer.getName(), customer.getAddress());
  }

  public void deleteById(long id) {
    springJdbcTemplate.update(DELETE_QUERY, id);
  }

  public Customer findById(long id) {
    return springJdbcTemplate.queryForObject(SELECT_QUERY, 
      new BeanPropertyRowMapper<>(Customer.class), id);
  }

}
