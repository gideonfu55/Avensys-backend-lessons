package com.java.learnspringframework.componentBasic;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.learnspringframework.componentBasic.gameconsole.GameConsole;

@Configuration
@ComponentScan(basePackages = {
  "com.java.learnspringframework.componentBasic.game",
  "com.java.learnspringframework.componentBasic.gameconsole"
})
public class GamingApplication {
  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(GamingApplication.class)) {
      context.getBean(GameConsole.class).runGame();;
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
