package com.java.learnspringframework.lazyInitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // Eager initialization
class EgOne {

}

@Component
@Lazy // Lazy initialization means it will let the context finish first before starting.
class EgTwo {

  private EgOne egOne;

  public EgTwo(EgOne egOne) {
    System.out.println("EgTwo initialization code has started already.");
    this.egOne = egOne;
  }

  public EgOne getEgOne() {
    return egOne;
  }

  public void setEgOne(EgOne egOne) {
    this.egOne = egOne;
  }

  public void message() {
    System.out.println("\nDisplaying something about the DemoTwo class.\n");
  }

}

@Configuration
@ComponentScan
public class LazyInitializationApplication {
  public static void main(String[] args) {

    try (
      var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class)) {

        System.out.println("Initialization of the context is completed.");

        Arrays.stream(context.getBeanDefinitionNames())
          .forEach(name -> System.out.println(name));

        EgTwo eg = context.getBean(EgTwo.class);
        eg.message();
      }
  }
}
