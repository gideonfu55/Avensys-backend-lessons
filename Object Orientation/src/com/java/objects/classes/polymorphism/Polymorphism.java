package com.java.objects.classes.polymorphism;

class Teacher {
  void teach() {
    System.out.println("Teacher is teaching");
  }

  void takeAttendance() {
    System.out.println("Teacher is taking attendance.");
  }
}

class PhysicsTeacher extends Teacher {
  // void teach() {
  //   System.out.println("Physics teacher is teaching physics.");
  // }

  void phyLabExp() {
    System.out.println("Physics teacher is conducting a Physics experiment.");
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
    PhysicsTeacher pt1 = new PhysicsTeacher(); // this is known as tight coupling
    ChemistryTeacher ct1 = new ChemistryTeacher();
    BiologyTeacher bt1 = new BiologyTeacher();
    pt1.teach(); // 1:1
    ct1.teach(); // 1:1
    bt1.teach(); // 1:1
    Teacher ref;
    ref = pt1;
    ref.teach(); 
    ref.takeAttendance(); // pt is taking 2 forms now: Teacher and PhysicsTeacher
    // ref.phyLabExp(); // This is not possible, because the parent cannot use the methods of the child.
  }
}
