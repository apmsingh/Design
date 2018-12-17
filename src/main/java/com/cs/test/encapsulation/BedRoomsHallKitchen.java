package com.cs.test.encapsulation;


public class BedRoomsHallKitchen extends House {

  BedRoomsHallKitchen(int noOfBedRoms, int noOfRestRooms, int noOfKitchens, int noOfStoreRooms,
      int noOfHalls, int noOfBalcony)
  {
    super(noOfBedRoms, noOfRestRooms, noOfKitchens, noOfStoreRooms, noOfHalls, noOfBalcony);
  }
  
  int getCostOfOneBHKHouse() {
    return getCostOfHouse();
  }
}
