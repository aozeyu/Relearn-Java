package com.java;

public class Break {
  public static void main(String[] args) {
    int i = 0;
    OUTER:
    while (true) {
      i++;
      INNER:
      while (true) {
        int y = 0;

        if (i % 2 == 0) {
          continue INNER;
        }
        System.out.println("Hi " + i);
        if (i > 100) {
          break OUTER;
        }
      }
    }

  }
}
