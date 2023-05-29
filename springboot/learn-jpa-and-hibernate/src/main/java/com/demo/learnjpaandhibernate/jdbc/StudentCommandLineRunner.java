package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.student.Student;
import com.demo.learnjpaandhibernate.student.jpa.StudentJpaRepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {

  // private StudentJdbcRepository studentJdbcRepository;
  private StudentJpaRepository studentJpaRepository;

  public StudentCommandLineRunner(StudentJpaRepository studentJpaRepository) {
    this.studentJpaRepository = studentJpaRepository;
  }
  
  @Override
  public void run(String... args) throws Exception {
    studentJpaRepository.insert(new Student(1L, "Gideon", "Singapore"));
    studentJpaRepository.insert(new Student(2L, "Silas", "Singapore"));
    studentJpaRepository.insert(new Student(3L, "Emmanuel", "Singapore"));
    studentJpaRepository.deleteById(3);
    System.out.println(studentJpaRepository.findById(1));
  }
  
}
