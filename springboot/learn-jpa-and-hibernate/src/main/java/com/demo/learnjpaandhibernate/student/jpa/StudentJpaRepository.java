package com.demo.learnjpaandhibernate.student.jpa;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.learnjpaandhibernate.student.Student;

import jakarta.persistence.EntityManager;

public class StudentJpaRepository {

  @Autowired
  private EntityManager entityManager;

  public void insert(Student student) {
    entityManager.merge(student);
  }

  
}
