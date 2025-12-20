package com.java;

public class Scope {
  int x = 10;

  public void doSomething() {
    int y = 8;
    System.out.println(x);
    int z;
    if ( y <10) {
       z = 11;
       String s = null;
      System.out.println(z);
    }else {
      z = 20;
    }
  }

  public void doSomethingElse() {
    System.out.println();
  }


}
