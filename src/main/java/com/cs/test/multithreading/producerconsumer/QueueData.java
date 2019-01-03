package com.cs.test.multithreading.producerconsumer;

public class QueueData {
  
  int     queue;
  boolean valueChange = true;
  
  synchronized void put(int value)
  {
    while (valueChange) {
      
      try {
        wait();
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    this.queue = value;
    this.valueChange = true;
    System.out.println("Put " + value);
    notify();
    
  }
  
  synchronized void get()
  {
    while (!valueChange) {
      try {
        wait();
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Get " + this.queue);
    this.valueChange = false;
    notify();
  }
}
