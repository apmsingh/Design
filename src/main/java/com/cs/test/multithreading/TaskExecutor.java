package com.cs.test.multithreading;

public class TaskExecutor {
  
  public static void main(String[] args)
  {
    Thread currentThread = Thread.currentThread();
    System.out.println("Current Thread: " + currentThread);
    
    //new ImplementingRunnable();
    //new ExtendingThread();
    new ImplementingRunnable("First thread ");
    new ImplementingRunnable("Second thread ");
    new ImplementingRunnable("Third thread ");
    currentThread.setName(TaskExecutor.class.getSimpleName());
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println(currentThread.getName() + " " + i);
        currentThread.sleep(500);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
