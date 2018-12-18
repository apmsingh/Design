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
}
