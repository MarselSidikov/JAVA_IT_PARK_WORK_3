package ru.itpark;

public class MainThreadPool {
  public static void main(String[] args) {
    ThreadPool threadPool = new ThreadPool(2);

    threadPool.submitTask(() -> {
      for (int i = 0; i < 1000; i++) {
        System.out.println(Thread.currentThread().getName() + " A");
      }
    });

    threadPool.submitTask(() -> {
      for (int i = 0; i < 1000; i++) {
        System.out.println(Thread.currentThread().getName() + " B");
      }
    });

    threadPool.submitTask(() -> {
      for (int i = 0; i < 1000; i++) {
        System.out.println(Thread.currentThread().getName() + " C");
      }
    });
  }
}
