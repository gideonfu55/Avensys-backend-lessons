package com.java.objects.classes.polymorphism;

class Teacher {
  void teach() {
    System.out.println("Teacher is teaching");
  }
}

class PhysicsTeacher extends Teacher {
  void teach() {
    System.out.println("Physics teacher is teaching physics.");
  }
}

class ChemistryTeacher extends Teacher {
  void teach() {
    System.out.println("Chemistry teacher is teaching chemistry");
  }
}

class BiologyTeacher extends Teacher {
  void teach() {
    System.out.println("Biology teacher is teaching biology.");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    PhysicsTeacher pt1 = new PhysicsTeacher();
    ChemistryTeacher ct1 = new ChemistryTeacher();
    BiologyTeacher bt1 = new BiologyTeacher();
    pt1.teach(); // 1:1
    ct1.teach(); // 1:1
    bt1.teach(); // 1:1
  }
}
