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

  void chemLabExp() {
    System.out.println("Chemistry teacher is conducting a Chemistry experiment.");
  }
}

class BiologyTeacher extends Teacher {
  void teach() {
    System.out.println("Biology teacher is teaching biology.");
  }

  void bioLabExp() {
    System.out.println("Biology teacher is conducting a Biology experiment.");
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
    // ref.phyLabExp(); // This give an error because the parent cannot use the methods of the child. We need to downcast in order to use the methods of the child from the parent.
    ((PhysicsTeacher)ref).phyLabExp();

    ref = ct1;
    ((ChemistryTeacher)ref).chemLabExp();

    ref = bt1;
    ((BiologyTeacher)ref).bioLabExp();
    
  }
}
