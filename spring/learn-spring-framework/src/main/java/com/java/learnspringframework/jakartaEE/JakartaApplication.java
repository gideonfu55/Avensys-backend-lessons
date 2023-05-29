package com.java.learnspringframework.jakartaEE;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Named
class BusinessClass {

  private Data data;

  public Data getData() {
    return data;
  }

  @Inject
  public void setData(Data data) {
    System.out.println("Setter injection started.");
    this.data = data;
  }
  
}

@Named
class Data {

}

@Configuration
@ComponentScan
public class JakartaApplication {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(JakartaApplication.class)) {

      Arrays.stream(context.getBeanDefinitionNames())
        .forEach(System.out::println);

      System.out.println(context.getBean(BusinessClass.class));
    }
  }
}
