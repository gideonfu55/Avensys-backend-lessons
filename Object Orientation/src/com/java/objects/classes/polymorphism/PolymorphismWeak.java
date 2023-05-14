package com.java.objects.classes.polymorphism;

class TeacherB {
  void teach() {
    System.out.println("Teacher is teaching");
  }

  void takeAttendance() {
    System.out.println("Teacher is taking attendance.");
  }
}

class PhysicsTeacherB extends TeacherB {
  // void teach() {
  //   System.out.println("Physics teacher is teaching physics.");
  // }

  void phyLabExp() {
    System.out.println("Physics teacher is conducting a Physics experiment.");
  }
}

class ChemistryTeacherB extends TeacherB {
  void teach() {
    System.out.println("Chemistry teacher is teaching chemistry");
  }

  void chemLabExp() {
    System.out.println("Chemistry teacher is conducting a Chemistry experiment.");
  }
}

class BiologyTeacherB extends TeacherB {
  void teach() {
    System.out.println("Biology teacher is teaching biology.");
  }

  void bioLabExp() {
    System.out.println("Biology teacher is conducting a Biology experiment.");
  }
}

public class PolymorphismWeak {
  public static void main(String[] args) {
    PhysicsTeacherB pt1 = new PhysicsTeacherB(); // this is known as tight coupling
    ChemistryTeacherB ct1 = new ChemistryTeacherB();
    BiologyTeacherB bt1 = new BiologyTeacherB();
    pt1.teach(); // 1:1
    ct1.teach(); // 1:1
    bt1.teach(); // 1:1
    TeacherB ref;
    ref = pt1;
    ref.teach();
    ref.takeAttendance(); // pt is taking 2 forms now: Teacher and PhysicsTeacher
    // ref.phyLabExp(); // This give an error because the parent cannot use the methods of the child. We need to downcast in order to use the methods of the child from the parent.
    ((PhysicsTeacherB)ref).phyLabExp();

    ref = ct1;
    ((ChemistryTeacherB)ref).chemLabExp();

    ref = bt1;
    ((BiologyTeacherB)ref).bioLabExp();
    
  }
}
