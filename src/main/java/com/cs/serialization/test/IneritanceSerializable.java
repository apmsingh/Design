package com.cs.serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ParentSerialize implements Serializable {
  
  int i = 10;
}

class ChildSerialize extends ParentSerialize {
  
  int j = 20;
}

public class IneritanceSerializable {
  
  public static void main(String[] args) throws Exception
  {
    ChildSerialize childSerialize = new ChildSerialize();
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
    System.out.println(readObject.i + " " + readObject.j);
    
  }
}
