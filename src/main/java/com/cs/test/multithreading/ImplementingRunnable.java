package com.cs.test.multithreading;

public class ImplementingRunnable implements Runnable {
  
  Thread             t;
  static SynchronizeProcess process;
  
  public ImplementingRunnable()
  {
    t = new Thread(this, ImplementingRunnable.class.getSimpleName());
    System.out.println("Constructor Assingment Done");
    t.start();
  }
  
  public ImplementingRunnable(String threadName)
  {
    t = new Thread(this, threadName);
    process = new SynchronizeProcess();
    System.out.println("Constructor Assingment Done");
    t.start();
  }
  
  /*@Override
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
  }*/
  
  @Override
  public void run()
  {
    try {
      synchronized (process) {
        process.processData(t.getName());
      }
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  
}
