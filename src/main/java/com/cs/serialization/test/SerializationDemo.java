package com.cs.serialization.test;

import java.io.EOFException;
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

class ProcessData implements Serializable {
  int i = 10;
  int j = 30;
}

class TransferData implements Serializable {
  int i = 20;
  int j = 40;
}

public class SerializationDemo {
  
  public static void main(String[] args) throws Exception
  {
    Data data = new Data();
    ProcessData processData = new ProcessData();
    TransferData transferData = new TransferData();
    // Serialization
    FileOutputStream fileOutputStream = new FileOutputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(data);
    objectOutputStream.writeObject(processData);
    objectOutputStream.writeObject(transferData);
    
    // DeSerialization without knowing the input sequence of serialization
    FileInputStream fileInputStream = new FileInputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Object readObject;
    try {
      while((readObject = objectInputStream.readObject()) != null) {
        printTheValue(readObject);
      }
    }
    catch (EOFException e) {
      //e.printStackTrace();
    }
    //System.out.println(readObject.i + " " + readObject.j + " " + readObject.k + " " + readObject.l);
  }

  private static void printTheValue(Object readObject)
  {
    if(readObject instanceof Data) {
      Data data = (Data) readObject;
      System.out.println(data.i + " " + data.j + " " + data.l);
    } else if(readObject instanceof ProcessData) {
      ProcessData data = (ProcessData) readObject;
      System.out.println(data.i + " " + data.j);
    }else if(readObject instanceof TransferData) {
      TransferData data = (TransferData) readObject;
      System.out.println(data.i + " " + data.j);
    }
  }
}
