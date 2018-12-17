package com.cs.test.encapsulation;

public class Executor {
  
  public static void main(String[] args)
  {
    House oneBHK = new BedRoomHallKitchen(1, 1, 1, 0, 1, 1);
    System.out.println("Cost of One BHK: " + oneBHK.getCostOfHouse());
    House twoBHK = new BedRoomsHallKitchen(2, 2, 1, 1, 1, 2);
    System.out.println("Cost of One 2BHK: " + twoBHK.getCostOfHouse());
  }
}
