package com.java.learnspringframework.componentBasic.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGameQualifier")
public class MarioGame extends Game {

  private static String name = "Super Mario Game";

  public MarioGame() {
    super(name);
  }

  public void up() {
    System.out.println("Jumping");
  }

  public void down() {
    System.out.println("Going into a hole");
  }

  public void left() {
    System.out.println("Going backwards");
  }

  public void right() {
    System.out.println("Accelerating forward");
  }

}
