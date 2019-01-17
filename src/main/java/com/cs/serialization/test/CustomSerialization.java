package com.cs.serialization.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializeAccount implements Serializable {
  
  String                username              = "Abhay";
  transient String      pass                  = "password";
  OtherSerializeAccount otherSerializeAccount = new OtherSerializeAccount();
  
  private void writeObject(ObjectOutputStream objectOutputStream) throws Exception
  {
    System.out.println("Inside the output stream");
    objectOutputStream.defaultWriteObject();
    String encPass = "Ency_" + pass;
    objectOutputStream.writeObject(encPass);
  }
  
  private void readObject(ObjectInputStream objectInputStream) throws Exception
  {
    System.out.println("Inside the input stream");
    objectInputStream.defaultReadObject();
    String encpass = (String) objectInputStream.readObject();
    String pass = encpass.substring(5);
    this.pass = pass;
  }
}

class OtherSerializeAccount implements Serializable {
  
  int i = 10;
  
  private void writeObject(ObjectOutputStream objectOutputStream) throws Exception
  {
    objectOutputStream.defaultWriteObject();
    System.out.println("Inside the output stream" + OtherSerializeAccount.class.getName());
  }
  
  private void readObject(ObjectInputStream objectInputStream) throws Exception
  {
    objectInputStream.defaultReadObject();
    System.out.println("Inside the input stream" + OtherSerializeAccount.class.getName());
  }
}


public class CustomSerialization {
  
  public static void main(String[] args) throws Exception
  {
    SerializeAccount data = new SerializeAccount();
    System.out.println(data.username + " " + data.pass);
    FileOutputStream fileOutputStream = new FileOutputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(data);
    
    // DeSerialization without knowing the input sequence of serialization
    FileInputStream fileInputStream = new FileInputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    SerializeAccount readObject = (SerializeAccount) objectInputStream.readObject();
    System.out.println(readObject.username + " " + readObject.pass + " " + readObject.otherSerializeAccount.i);
    
  }
}
