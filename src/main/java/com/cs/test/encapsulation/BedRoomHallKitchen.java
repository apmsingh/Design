package com.cs.test.encapsulation;


public class BedRoomHallKitchen extends House {

  BedRoomHallKitchen(int noOfBedRoms, int noOfRestRooms, int noOfKitchens, int noOfStoreRooms,
      int noOfHalls, int noOfBalcony)
  {
    super(noOfBedRoms, noOfRestRooms, noOfKitchens, noOfStoreRooms, noOfHalls, noOfBalcony);
  }
  
  int getCostOfOneBHKHouse() {
    return getCostOfHouse();
  }
}
