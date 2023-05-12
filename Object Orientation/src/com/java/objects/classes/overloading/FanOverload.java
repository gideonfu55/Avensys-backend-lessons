package com.java.objects.classes.overloading;

public class FanOverload extends Object {

  private String brand;
  private int numBlades;
  private String color;

  public FanOverload() {

  }

  public FanOverload(String brand, int numBlades, String color) {
    this();
    this.brand = brand;
    this.numBlades = numBlades;
    this.color = color;
  }

  public FanOverload(String brand, int numBlades) {
    this("Samsung", 4, "Black");
    this.brand = brand;
    this.numBlades = numBlades;
  }

  public FanOverload(String brand) {
    this("Panasonic", 3);
    this.brand = brand;
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
