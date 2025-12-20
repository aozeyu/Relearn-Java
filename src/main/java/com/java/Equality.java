package com.java;

public class Equality {
  public static void main(String[] args) {
    int x = 10;
    if (x == 10) {
      System.out.println("x is 10!");
    }
    String s = new String("Java");
    String s1 = new String("Java");
    // == 不检查引用类型的值 equals 比较类型和值
    if (s == s1) {
      System.out.println("they re equal");
    }
    if (s.equals(s1)){
      System.out.println("they re equal");
    }

  }
}
