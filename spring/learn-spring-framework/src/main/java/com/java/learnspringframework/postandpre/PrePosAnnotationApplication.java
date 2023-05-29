package com.java.learnspringframework.postandpre;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class NormalClass {

  private Dependency dependency;

  public NormalClass (Dependency dependency) {
    super();
    this.dependency = dependency;
    System.out.println("All dependencies are ready!");
  }

  // This annotation is for invoking the method below immediately after the bean's initialization, but before it is put into service. It ensures that the bean is fully initialized and all its dependencies are set before the method the method is executed.
  @PostConstruct
  public void initialize() {
    dependency.getReady();
  }

  // This annotation is for marking a method that should be invoked just before the bean is removed from the container. It allows you to perform cleanup tasks or release any resources held by the bean.
  @PreDestroy
  public void cleanUp() {
    dependency.cleanUp();
  }

}

@Component
class Dependency {
  
  public void getReady() {
    System.out.println("Right after bean's initialization. Some logic using dependency.");
  }
  
  public void cleanUp() {
    System.out.println("Cleaning up the beans.");
  }

}

@Configuration
@ComponentScan
public class PrePosAnnotationApplication {
  public static void main(String[] args) {
    try (
      var context = new AnnotationConfigApplicationContext(PrePosAnnotationApplication.class)
      ) {
      Arrays.stream(context.getBeanDefinitionNames())
        .forEach(System.out::println);

      NormalClass normalClass = context.getBean(NormalClass.class);
      normalClass.initialize();
      normalClass.cleanUp();

    }
  }
}
