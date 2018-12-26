package com.cs.test.multithreading;

public class ExtendingThread extends Thread {
  
  public ExtendingThread()
  {
    super(ExtendingThread.class.getSimpleName());
    System.out.println("Constructor Assingment Done");
    start();
  }
  
  @Override
  public void run()
  {
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println(this.getName() + " " + i);
        Thread.sleep(500);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  
}
