package com.cs.test.multithreading.producerconsumer;

public class Consumer implements Runnable {
  
  QueueData queue;
  
  public Consumer(QueueData queue)
  {
    this.queue = queue;
    new Thread(this, "Consumer").start();
  }
  
  @Override
  public void run()
  {
    while (true) {
      queue.get();
    }
  }
  
}
