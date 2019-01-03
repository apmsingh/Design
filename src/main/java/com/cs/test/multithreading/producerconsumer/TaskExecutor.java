package com.cs.test.multithreading.producerconsumer;


public class TaskExecutor {
  public static void main(String[] args)
  {
    QueueData queue = new QueueData();
    new Producer(queue);
    new Consumer(queue);
    System.out.println("Finished");
  }
}
