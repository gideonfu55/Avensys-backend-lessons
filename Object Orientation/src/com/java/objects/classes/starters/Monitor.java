package com.java.objects.classes.starters;

public class Monitor {

  String brand;
  String shape;
  String colour;
  int brightness;

  public Monitor(String brand, String shape, String colour, int brightness) {
    this.brand = brand;
    this.shape = shape;
    this.colour = colour;
    this.brightness = brightness;
  }

  public void powerUp() {
    System.out.println(brand + " monitor is currently switched on.");
  }

  public void brightnessUp() {
    this.brightness++;
    System.out.println(brand + " monitor's brightness increased. Current brightness: " + brightness);
  }

  public void blueScreen() {
    System.out.println(brand + " monitor is showing the blue screen of death.");
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getShape() {
    return this.shape;
  }

  public void setShape(String shape) {
    this.shape = shape;
  }

  public String getColour() {
    return this.colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public int getBrightness() {
    return this.brightness;
  }

  public void setBrightness(int brightness) {
    this.brightness = brightness;
  }

  @Override
  public String toString() {
    return "{" +
      " brand='" + getBrand() + "'" +
      ", shape='" + getShape() + "'" +
      ", colour='" + getColour() + "'" +
      ", brightness='" + getBrightness() + "'" +
      "}";
  }

}
