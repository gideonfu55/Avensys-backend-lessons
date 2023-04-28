package com.java.objects;

import com.java.objects.classes.Fan;

public class LaunchApp {
  public static void main(String[] args) {

    Fan panasonic = new Fan("Black", "Panasonic", 4);
    Fan samsung = new Fan("Green", "Samsung", 4);
    Fan mitsubishi = new Fan("Black", "Mitsubishi", 4);

    System.out.println();

    panasonic.rotate();
    samsung.stop();
    mitsubishi.blowAir();
    
  }
}
