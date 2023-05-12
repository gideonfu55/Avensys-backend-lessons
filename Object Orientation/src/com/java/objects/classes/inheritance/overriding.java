package com.java.objects.classes.inheritance;

class Teacher {
  void markAttendance() {
    System.out.println("Teacher is marking attendance.");
  }

  void teach() {
    System.out.println("Teacher is teaching");
  }
}

class PhysicsTeacher extends Teacher {
  void teach() {
    System.out.println("Physics teacher is teaching physics.");
  }

  void labExpPhy() {
    System.out.println("Physics teacher is doing a lab experiment.");
  }
}

class BiologyTeacher extends Teacher {
  void teach() {
    System.out.println("Biology teacher is teaching biology.");
  }

  void labExpBio() {
    System.out.println("Biology teacher is doing a human experiment.");
  }
}

public class Overriding extends Object {
  public static void main(String[] args) {
    PhysicsTeacher pt1 = new PhysicsTeacher();
    pt1.markAttendance();
    pt1.teach();
    pt1.labExpPhy();

    BiologyTeacher bt1 = new BiologyTeacher();
    bt1.teach();
    bt1.labExpBio();
  }
}
