package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.student.Student;
import com.demo.learnjpaandhibernate.student.jpa.StudentJpaRepository;
import com.demo.learnjpaandhibernate.student.springdatajpa.StudentSpringDataJpaRepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

  // private StudentJdbcRepository studentJdbcRepository;
  // private StudentJpaRepository studentJpaRepository;
  private StudentSpringDataJpaRepository studentSpringDataJpaRepository;

  public StudentCommandLineRunner(StudentSpringDataJpaRepository studentSpringDataJpaRepository) {
    this.studentSpringDataJpaRepository = studentSpringDataJpaRepository;
  }
  
  @Override
  public void run(String... args) throws Exception {
    studentSpringDataJpaRepository.save(new Student(1L, "Gideon", "Singapore"));
    studentSpringDataJpaRepository.save(new Student(2L, "Silas", "Singapore"));
    studentSpringDataJpaRepository.save(new Student(3L, "Emmanuel", "Singapore"));
    studentSpringDataJpaRepository.deleteById(3L);
    System.out.println(studentSpringDataJpaRepository.findById(1L));
  }
  
}
