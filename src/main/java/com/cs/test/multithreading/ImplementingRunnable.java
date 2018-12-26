package com.cs.test.multithreading;

public class ImplementingRunnable implements Runnable {
  
  Thread t;
  
  public ImplementingRunnable()
  {
    t = new Thread(this, ImplementingRunnable.class.getSimpleName());
    System.out.println("Constructor Assingment Done");
    t.start();
  }
  
  public ImplementingRunnable(String threadName)
  {
    t = new Thread(this, threadName);
    System.out.println("Constructor Assingment Done");
    t.start();
  }
  
  @Override
  public void run()
  {
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println(t.getName() + " " + i);
        Thread.sleep(500);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
}