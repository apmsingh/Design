package com.cs.test.multithreading;


public class SynchronizeProcess {
  
  public void processData(String threadName) throws InterruptedException
  {
    System.out.println("Line 1 of the thread " + threadName);
    Thread.sleep(1000);
    System.out.println("Line 2 of the thread " + threadName);
  }
}
