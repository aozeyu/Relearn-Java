package com.java;

public class Wrapper {
  public static void main(String[] args) {
    int x = 10;
    Integer x1 = new Integer(10);
    Integer x2 = Integer.valueOf(10);
    Integer x3 = 10;
    doSomething(x3);
  }
  public static  void doSomething(Integer x) {

  }
}
