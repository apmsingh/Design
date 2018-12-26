package com.cs.test.inheritance;

public class ExceptionTest {
  
  public static void main(String[] args)
  {
    int a = 5;
    int b = 0;
    try {
       
       int d = 2;
       int e = 0;
       try {
         int k = d/e;
       } catch(ArithmeticException l) {
         System.out.println("Inside Hadnler");
       }
       System.out.println("After Statemnt");
       int c = a/b;
    }catch(Exception e) {
      System.out.println("Outer Handler");
    }
  }
}
