package ru.itpark.chick;

public class Main {

  public static void main(String[] args) throws Exception {
    EggThread egg = new EggThread();
    HenThread hen = new HenThread();

    egg.start();
    hen.start();


    egg.join();
    hen.join();

    for (int i = 1; i < 1000; i++) {
      System.out.println("Человек");
    }
  }
}