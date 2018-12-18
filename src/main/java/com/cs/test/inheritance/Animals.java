package com.cs.test.inheritance;

public class Animals {
  
  public Animals()
  {
    System.out.println("In super constructor");
  }
  
  void getParentName()
  {
    System.out.println(Animals.class.getSimpleName());
  }
  
  void showMyName() {
    System.out.println("My name is " + Animals.class.getSimpleName());
  }
  
  void showCategory() {
    System.out.println("I belong from " + Animals.class.getSimpleName());
  }
  
}
