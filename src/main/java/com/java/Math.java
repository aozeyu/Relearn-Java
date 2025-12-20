package com.java;

public class Math {
  public static void main(String[] args) {
    int i = 8 + 9; // 17
    int j = 12;
    int k = i + j; // 29
    i = k - j;  // 17
    i = k * j; // 17 * 12
    i = k / j; //  29 / 12 --  2
    System.out.println(i);
    boolean b = i < j;
    boolean b1 = i == 9;
    boolean b2 = i != 9;

    i++;  // 18
    i--;  // 17
    i = 7;
    i += 3;  // 10
    i /= 2;  // 5
    System.out.println(i);
  }
}
