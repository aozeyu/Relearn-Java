package com.java;

public class Break {
  public static void main(String[] args) {
    int i = 0;
    while (true) {
      i++;
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("Hi " + i);
      if (i > 100) {
        break;
      }
    }
  }
}
