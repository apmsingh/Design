package com.cs.test.encapsulation;


public class House {
 
  int noOfBedRooms;
  int noOfRestRooms;
  int noOfKitchens;
  int noOfStoreRooms;
  int noOfHalls;
  int noOfBalconys;
  
  House(int noOfBedRoms, int noOfRestRooms, int noOfKitchens, int noOfStoreRooms, int noOfHalls, int noOfBalcony) {
    this.noOfBedRooms = noOfBedRoms;
    this.noOfRestRooms = noOfRestRooms;
    this.noOfKitchens = noOfKitchens;
    this.noOfStoreRooms = noOfStoreRooms;
    this.noOfHalls = noOfHalls;
    this.noOfBalconys = noOfBalcony;
  }
  
  protected int getTotalNumberOfRooms() {
    return noOfBedRooms + noOfRestRooms + noOfKitchens + noOfStoreRooms + noOfHalls;
  }
  
  protected int getCostOfHouse() {
    return (noOfBedRooms * 100) + (noOfHalls * 500) + (noOfKitchens * 700);
  }
}
