package ru.itpark;

public class Main {

    public static void main(String[] args) throws Exception {
      FasterThread fasterThread = new FasterThread();
      fasterThread.start();

      SomeThread someThread = new SomeThread();
      Thread runnableThread = new Thread(someThread);
      runnableThread.start();

      Thread thread = Thread.currentThread();
      String threadName = thread.getName();
      System.out.println(threadName);

      System.out.println("Я немного притормаживаю =(");
      Thread.sleep(10000);
      System.out.println("Уффф, отпустило");

      Thread lambdaThread = new Thread(() -> {
        for (int i = 0; i < 100; i++) {
          System.out.println("HellO!");
        }
      });

      lambdaThread.start();
    }
}
