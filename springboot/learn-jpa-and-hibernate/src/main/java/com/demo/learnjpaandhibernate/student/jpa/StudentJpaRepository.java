package com.demo.learnjpaandhibernate.student.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.student.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentJpaRepository {

  @Autowired
  private EntityManager entityManager;

  public void insert(Student student) {
    entityManager.merge(student);
  }

  public Student findById(long id) {
    return entityManager.find(Student.class, id);
  }
  
  public void deleteById(long id) {
    entityManager.remove(findById(id));
  }
}
