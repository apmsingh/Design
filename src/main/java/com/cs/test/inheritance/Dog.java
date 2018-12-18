package com.cs.test.inheritance;

public class Dog extends Animals {
  
  Dog(String nameOfAnimal)
  {
    System.out.println("Inside Parameter constructor");
  }
  
  Dog()
  {
    this("Abacd");
    System.out.println("After Statement");
    super.getParentName();
  }
  
  void getAnimal()
  {
    System.out.println(Dog.class.getSimpleName());
  }
  
  void showMyName() {
    System.out.println("My name is " + Dog.class.getSimpleName());
  }
  
  void showCategory(String dogName) {
    System.out.println("I belong from " + dogName);
  }
}
