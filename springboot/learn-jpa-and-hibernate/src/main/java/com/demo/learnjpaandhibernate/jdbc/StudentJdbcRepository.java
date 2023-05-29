package com.demo.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.learnjpaandhibernate.student.Student;

@Repository
public class StudentJdbcRepository {
  
  @Autowired
  private JdbcTemplate springJdbcTemplate;

  private static String INSERT_QUERY = "INSERT INTO STUDENT(id, name, address)\nVALUES(?, ?, ?)";
  private static String DELETE_QUERY = "DELETE from STUDENT where id = ?";
  private static String SELECT_QUERY = "SELECT * from STUDENT where id = ?";

  public void insert(Student student) {
    springJdbcTemplate.update(INSERT_QUERY, student.getId(), student.getName(), student.getAddress());
  }

  public void deleteById(long id) {
    springJdbcTemplate.update(DELETE_QUERY, id);
  }

  public Student findById(long id) {
    return springJdbcTemplate.queryForObject(SELECT_QUERY, 
      new BeanPropertyRowMapper<>(Student.class), id);
  }

}
