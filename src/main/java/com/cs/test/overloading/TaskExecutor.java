package com.cs.test.overloading;

public class TaskExecutor {
  
  public static void main(String[] args)
  {
    new TaskExecutor().m1(5);
  }
  
  private void m1(Long l)
  {
    System.out.println("Inside Long");
  }
  
  private void m1(float f)
  {
    System.out.println("Inside float");
    
  }
}
