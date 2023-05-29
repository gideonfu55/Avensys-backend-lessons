package com.java.learnspringframework.componentBasic.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra extends Game {

  private static String name = "Super Contra Game";

  public SuperContra() {
    super(name);
  }

  public void up() {
    System.out.println("Climb up");
  }

  public void down() {
    System.out.println("Squat down");
  }

  public void left() {
    System.out.println("Move back");
  }

  public void right() {
    System.out.println("Move forward");
  }

  public void shoot() {
    System.out.println("Shoot weapon");
  }

}
