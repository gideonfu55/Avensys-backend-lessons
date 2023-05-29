package com.java.learnspringframework.componentBasic.game;

public abstract class Game {
  private String name;

  public Game(String name) {
    this.name = name;
  };

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void up();
  
  public abstract void down();
  
  public abstract void left();
  
  public abstract void right();


}