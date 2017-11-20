package ru.itpark;

public class Main {

    public static void main(String[] args) throws Exception {
      FasterThread fasterThread = new FasterThread();
      Thread thread = Thread.currentThread();
      String threadName = thread.getName();
      fasterThread.start();
      System.out.println(threadName);
      System.out.println("Я немного притормаживаю =(");
      Thread.sleep(10000);
      System.out.println("Уффф, отпустило");


    }
}
