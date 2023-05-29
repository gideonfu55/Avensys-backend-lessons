package com.demo.learnjpaandhibernate.student.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learnjpaandhibernate.student.Student;

public interface StudentSpringDataJpaRepository extends JpaRepository<Student, Long> {
  
  

}
