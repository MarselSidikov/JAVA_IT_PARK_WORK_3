package ru.itpark.special;

public class MainForPoolWorker {
  public static void main(String[] args) {
    PoolWorker poolWorker
        = new PoolWorker(() -> {
      System.out.println(Thread.currentThread().getName());
      System.out.println("Hello!");
    });

    poolWorker.start();
  }
}
