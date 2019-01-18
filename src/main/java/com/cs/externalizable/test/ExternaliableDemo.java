package com.cs.externalizable.test;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * In Externalization No need to write the transient keyword. Because programmer
 * is managing the write and read value. So no use of transient keyword
 * 
 */
class ExternalizableAccount implements Externalizable {
  
  String accountNo;
  String name;
  int    age;
  
  public ExternalizableAccount()
  {
    System.out.println("Inside Default Constructor");
  }
  
  public ExternalizableAccount(String accountNo, String name, int age)
  {
    this.accountNo = accountNo;
    this.name = name;
    this.age = age;
  }
  
  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
  {
    System.out.println("read external");
    accountNo = (String) in.readObject();
    age = in.readInt();
  }
  
  @Override
  public void writeExternal(ObjectOutput out) throws IOException
  {
    System.out.println("write external");
    out.writeObject(accountNo);
    out.writeInt(age);
  }
}

public class ExternaliableDemo {
  
  public static void main(String[] args) throws Exception
  {
    ExternalizableAccount data = new ExternalizableAccount("12345", "Abhay", 25);
    FileOutputStream fileOutputStream = new FileOutputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(data);
    
    // DeSerialization without knowing the input sequence of serialization
    FileInputStream fileInputStream = new FileInputStream(
        "D:/Abhay/Private/test/serialization.ser");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    ExternalizableAccount readObject = (ExternalizableAccount) objectInputStream.readObject();
    System.out.println(readObject.accountNo + " " + readObject.name + " " + readObject.age);
  }
}
