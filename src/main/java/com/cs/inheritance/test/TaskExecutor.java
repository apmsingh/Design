package com.cs.inheritance.test;

class InheritA {

  public static void m1() {
    System.out.println("Inside m1");
  }
  
  public void m2() {
    System.out.println("Inside m2");
  }
}

class InheritB extends InheritA {
  
  // Static method can't override
  public static void m1() {
    System.out.println("Inside B m1");
  }
  
  @Override
  public void m2() {
    System.out.println("Inside B m2");
  }
}

public class TaskExecutor {
  
  public static void main(String[] args)
  {
    InheritB b = new InheritB();
    b.m1();
    b.m2();
  }
}
