package com.demo.learnjpaandhibernate.customer.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.customer.Customer;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerJpaRepository {

  @Autowired
  private EntityManager entityManager;

  public void insert(Customer student) {
    entityManager.merge(student);
  }

  public Customer findById(long id) {
    return entityManager.find(Customer.class, id);
  }
  
  public void deleteById(long id) {
    entityManager.remove(findById(id));
  }
}
