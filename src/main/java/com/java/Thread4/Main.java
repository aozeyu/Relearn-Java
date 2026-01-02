package com.java.Thread4;

public class Main {
  public static void main(String[] args) {
    Counter counter = new Counter();
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100000; i++) {
          counter.increment();
        }
      }
    };
    Thread thread1 = new Thread(runnable);
    Thread thread2 = new Thread(runnable);
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    }catch (InterruptedException e){
        e.printStackTrace();
    }
    System.out.println("Count: " + counter.getCount());
  }
}
