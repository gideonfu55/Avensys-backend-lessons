package com.java.objects.classes.polymorphism;

class Teacher {
  public void teach() {
    System.out.println("Teacher is teaching.");
  }

  public void doExp() {
    System.out.println("Teacher is conducting an experiment.");
  }

  // public void takeAttendance() {
  // System.out.println("Teacher is taking attendance.");
  // }
}

class PhysicsTeacher extends Teacher {
  public void teach() {
  System.out.println("Physics teacher is teaching physics.");
  }

  public void doExp() {
    System.out.println("Physics teacher is conducting a Physics experiment.");
  }
}

class ChemistryTeacher extends Teacher {
  public void teach() {
    System.out.println("Chemistry teacher is teaching chemistry");
  }

  public void doExp() {
    System.out.println("Chemistry teacher is conducting a Chemistry experiment.");
  }
}

class BiologyTeacher extends Teacher {
  public void teach() {
    System.out.println("Biology teacher is teaching biology.");
  }

  public void doExp() {
    System.out.println("Biology teacher is conducting a Biology experiment.");
  }
}

class College {
  public void acceptTeacher(Teacher teacher) {
    teacher.teach();
    teacher.doExp();
  }
}

public class PolymorphismFlex extends Object {
  public static void main(String[] args) {
    PhysicsTeacher pt1 = new PhysicsTeacher(); // this is known as tight coupling
    ChemistryTeacher ct1 = new ChemistryTeacher();
    BiologyTeacher bt1 = new BiologyTeacher();
    College college = new College();

    college.acceptTeacher(pt1);
    college.acceptTeacher(ct1);
    college.acceptTeacher(bt1);
  }
}
