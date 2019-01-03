package com.cs.test.multithreading.producerconsumer;

public class Producer implements Runnable {
  
  QueueData queue;
  
  public Producer(QueueData queue)
  {
    this.queue = queue;
    new Thread(this, "Producer").start();
  }
  
  @Override
  public void run()
  {
    System.out.println("Thread Started");
    int i = 1;
    while (true) {
      queue.put(i++);
    }
  }
  
}
