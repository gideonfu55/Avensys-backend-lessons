package com.java.objects.classes.inheritance;

public class FanParent {
  
  private String brand;
  private int numBlades;
  private String color;

  public FanParent(String brand, int numBlades, String color) {
    this.brand = brand;
    this.numBlades = numBlades;
    this.color = color;
  }

  public void rotate() {
    System.out.println("The " + brand + " fan is rotating.");
  }

  public void stop() {
    System.out.println("The " + brand + " fan has stopped.");
  }

  public void blowAir() {
    System.out.println("The " + brand + " fan is blowing air.");
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getNumBlades() {
    return this.numBlades;
  }

  public void setNumBlades(int numBlades) {
    this.numBlades = numBlades;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
