package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.student.Student;

@Repository
public class StudentJdbcRepository {
  
  @Autowired
  private JdbcTemplate springJdbcTemplate;

  private static String INSERT_QUERY = "INSERT INTO STUDENT(id, name, address)\nVALUES(?, ?, ?)";

  public void insert(Student student) {
    springJdbcTemplate.update(INSERT_QUERY, student.getId(), student.getName(), student.getAddress());
  }

}
