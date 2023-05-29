package com.java.learnspringframework.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// SuperMarket
@Component
class SuperMarket {

  @Autowired
  CustomerOne customerOne;

  @Autowired
  CustomerTwo customerTwo;

  public String toString() {
    return "Using " + customerOne + " and " + customerTwo + " as dependencies.";
  }
}

// CustomerOne
@Component
class CustomerOne {
  
}

// CustomerTwo
@Component
class CustomerTwo {

}

@Configuration
@ComponentScan
public class DependencyInjectionApplication {
  public static void main(String[] args) {

    try (
      var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication.class)
      ) {
        Arrays.stream(context.getBeanDefinitionNames())
        .forEach(System.out::println);

        System.out.println(context.getBean(SuperMarket.class).toString());
      }
    catch (BeansException e) {
      e.printStackTrace();
    }
  }
}

// var marioGame = new MarioGame();
// var superContra = new SuperContra();
// var gameconsole = new GameConsole(marioGame);
// var gameconsole2 = new GameConsole(superContra);

// gameconsole.runGame();
// gameconsole2.runGame();
