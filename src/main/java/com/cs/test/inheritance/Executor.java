package com.cs.test.inheritance;

public class Executor {
  
  public static void main(String[] args)
  {
    Animals animals = new Animals();
    animals.getParentName();
    
    Dog dog = new Dog();
    dog.getAnimal();
    dog.getParentName();
    
    animals = dog;
    // It cannot access child class member
    //animals.getAnimals();
  }
}
