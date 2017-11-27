package ru.itpark;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Worker extends Thread {
  // private static final Object MUTEX = new Object();

  private static Lock lock = new ReentrantLock();

  private int array[];
  private int start;
  private int end;

  public Worker(int[] array, int start, int end) {
    this.array = array;
    this.start = start;
    this.end = end;
  }

  public void run() {
    for (int i = start; i < end; i++) {
//      synchronized (MUTEX) {
//        System.out.println(Thread.currentThread().getName());
//        Main.result = Main.result + array[i];
//      }
      lock.lock();
      Main.result = Main.result + array[i];
      lock.unlock();
    }
  }
}
