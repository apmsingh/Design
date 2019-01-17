package com.cs.serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// If we won't serialize any of the class as Serializable it won't allow to
// serialize it
class TransientDataMulti implements Serializable {
  
  int k = 78;
  int i = 90;
}

class DataMulti implements Serializable {
  
  int              k = 78;
  ProcessDataMulti p = new ProcessDataMulti();
  transient TransientDataMulti t = new TransientDataMulti();
  transient Integer l = 99;
}

class ProcessDataMulti implements Serializable {
  
  TransferDataMulti t = new TransferDataMulti();
}

class TransferDataMulti implements Serializable {
  
  int i = 20;
  int j = 40;
}

public class MultiGraphSerializationDemo {
  
  public static void main(String[] args) throws Exception
  {
    DataMulti data = new DataMulti();
    // Serialization
    FileOutputStream fileOutputStream = new FileOutputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(data);
    
    // DeSerialization without knowing the input sequence of serialization
    FileInputStream fileInputStream = new FileInputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    DataMulti readObject = (DataMulti) objectInputStream.readObject();
    System.out.println(readObject.p.t.i + " " + readObject.p.t.j);
    System.out.println(readObject.t + " " + readObject.l);
  }
  
}
