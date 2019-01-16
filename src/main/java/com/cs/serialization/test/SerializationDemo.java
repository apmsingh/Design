package com.cs.serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Data implements Serializable {
  int i = 10;
  transient int j = 20;
  static int k = 40;
  final int l = 80;
}

public class SerializationDemo {
  
  public static void main(String[] args) throws Exception
  {
    Data data = new Data();
    
    // Serialization
    FileOutputStream fileOutputStream = new FileOutputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(data);
    
    // DeSerialization
    FileInputStream fileInputStream = new FileInputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Data readObject = (Data) objectInputStream.readObject();
    System.out.println(readObject.i + " " + readObject.j + " " + readObject.k + " " + readObject.l);
  }
}
