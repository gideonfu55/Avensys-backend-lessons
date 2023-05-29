package com.java.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class JavaSchool {

  StudentOne studentOne;
  StudentTwo studentTwo;

  @Autowired
  public void setStudentOne(StudentOne studentOne) {
    System.out.println("Setter injection - studentOne dependency");
    this.studentOne = studentOne;
  }

  @Autowired
  public void setStudentTwo(StudentTwo studentTwo) {
    System.out.println("Setter injection - studentTwo dependency");
    this.studentTwo = studentTwo;
  }

  public String toString() {
    return "Using " + studentOne + " and " + studentTwo + " as dependencies.";
  }
}

@Component
class StudentOne {
  
}

@Component
class StudentTwo {

}

@Configuration
@ComponentScan(basePackageClasses = JavaSchool.class)
public class DependencyInjectionApplication02 {
  public static void main(String[] args) {

    try (
      var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication02.class)
      ) {
        Arrays.stream(context.getBeanDefinitionNames())
        .forEach(n -> System.out.println(n));

        System.out.println(context.getBean(JavaSchool.class).toString());
      }
    catch (BeansException e) {
      e.printStackTrace();
    }
  }
}
