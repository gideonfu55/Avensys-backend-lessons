package com.java.learnspringframework.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Student(String name, int age, Address address) {
  
}

record Address(String city) {

}

// 2: Configure the things which our spring will be managing - configuration class:
// 2b: Use @Bean annotation for the blocks within
@Configuration
public class HelloWorldConfiguration {

  @Bean
  public String name() {
    String name = "Gideon Fu";
    return name;
  }

  @Bean
  public int age() {
    return 23;
  }

  @Bean(name = "studentAddress")
  @Primary
  public Address address() {
    return new Address("Singapore");
  }

  @Bean(name = "studentAddressTwo")
  public Address addressTwo() {
    return new Address("Australia");
  }

  // The bean identification is pretty powerful here (nvm the algorithm it uses):
  // - It can simply take the method from above to identify the arguments to place for each constructor field based on:
  // 1. Class
  // 2. Type

  // If you have more than 2 types of the same, there is a runtime error. Unless you use @primary annotation to determine which Bean to use. With that, you can still use @Qualifier to use the second Bean if you choose.
  @Bean
  public Student student(String name, int age, @Qualifier("studentAddressTwo")Address address) {
    return new Student(name, age, address);
  }

}
