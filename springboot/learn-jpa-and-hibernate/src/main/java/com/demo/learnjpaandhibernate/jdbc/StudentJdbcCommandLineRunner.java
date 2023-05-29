package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learnjpaandhibernate.student.Student;

@Component
public class StudentJdbcCommandLineRunner implements CommandLineRunner {

  private final StudentJdbcRepository studentJdbcRepository;

  public StudentJdbcCommandLineRunner(StudentJdbcRepository studentJdbcRepository) {
    this.studentJdbcRepository = studentJdbcRepository;
  }
  
  @Override
  public void run(String... args) throws Exception {
    studentJdbcRepository.insert(new Student(1L, "Gideon", "Singapore"));
    studentJdbcRepository.insert(new Student(2L, "Silas", "Singapore"));
    studentJdbcRepository.insert(new Student(3L, "Emmanuel", "Singapore"));
    studentJdbcRepository.deleteById(3);
    System.out.println(studentJdbcRepository.findById(1));
  }
  
}
