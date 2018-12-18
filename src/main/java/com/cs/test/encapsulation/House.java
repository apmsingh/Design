package com.cs.test.encapsulation;

import java.util.UUID;

public class House extends HouseManagement {
  
  int            noOfBedRooms;
  int            noOfRestRooms;
  int            noOfKitchens;
  int            noOfStoreRooms;
  int            noOfHalls;
  int            noOfBalconys;
  private String registrationNumber;
  
  House(int noOfBedRoms, int noOfRestRooms, int noOfKitchens, int noOfStoreRooms, int noOfHalls,
      int noOfBalcony)
  {
    this.noOfBedRooms = noOfBedRoms;
    this.noOfRestRooms = noOfRestRooms;
    this.noOfKitchens = noOfKitchens;
    this.noOfStoreRooms = noOfStoreRooms;
    this.noOfHalls = noOfHalls;
    this.noOfBalconys = noOfBalcony;
    this.registrationNumber = UUID.randomUUID().toString();
  }
  
  protected int getTotalNumberOfRooms()
  {
    return noOfBedRooms + noOfRestRooms + noOfKitchens + noOfStoreRooms + noOfHalls;
  }
  
  protected int getCostOfHouse()
  {
    return (noOfBedRooms * 100) + (noOfHalls * 500) + (noOfKitchens * 700);
  }
  
  @Override
  protected int houseTaxCalculation()
  {
    return (noOfBedRooms + noOfHalls + noOfKitchens) * 500;
  }
  
  @Override
  public void getRegistrationNumber()
  {
    System.out.println("Registeration Number: " + registrationNumber);
  }
}
