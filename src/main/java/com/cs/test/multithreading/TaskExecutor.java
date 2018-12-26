package com.cs.test.multithreading;

public class TaskExecutor {
  
  public static void main(String[] args)
  {
    Thread currentThread = Thread.currentThread();
    System.out.println("Current Thread: " + currentThread);
    
    // new ImplementingRunnable();
    // new ExtendingThread();
    ImplementingRunnable threadOne = new ImplementingRunnable("First thread ");
    ImplementingRunnable threadTwo = new ImplementingRunnable("Second thread ");
    ImplementingRunnable threadThree = new ImplementingRunnable("Third thread ");
    currentThread.setName(TaskExecutor.class.getSimpleName());
    for (int i = 0; i < 5; i++) {
      try {
        System.out.println(currentThread.getName() + " " + i);
        currentThread.sleep(100);
      }
      catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    try {
      threadOne.t.join();
      threadTwo.t.join();
      threadThree.t.join();
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Main Thread Finished");
  }
}
