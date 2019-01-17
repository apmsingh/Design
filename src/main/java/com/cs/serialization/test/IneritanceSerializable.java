package com.cs.serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.cs.test.inheritance.Animals;

class ParentSerialize {
  
  int i = 10;
}

class ChildSerialize extends ParentSerialize implements Serializable {
  
  // It won't allow because class is not serializable
  // ParentSerialize p = new ParentSerialize();
  int j = 20;
}

public class IneritanceSerializable {
  
  public static void main(String[] args) throws Exception
  {
    ChildSerialize childSerialize = new ChildSerialize();
    childSerialize.i = 50;
    childSerialize.j = 60;
    System.out.println(childSerialize.i + " " + childSerialize.j);
    FileOutputStream fileOutputStream = new FileOutputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(childSerialize);
    
    // DeSerialization without knowing the input sequence of serialization
    FileInputStream fileInputStream = new FileInputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    ChildSerialize readObject = (ChildSerialize) objectInputStream.readObject();
   
    // INSTANCE CONTROL FLOW WILL WORK HERE
    System.out.println(readObject.i + " " + readObject.j);
    
  }
}
