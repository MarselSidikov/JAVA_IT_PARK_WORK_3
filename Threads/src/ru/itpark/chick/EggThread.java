package ru.itpark.chick;

public class EggThread extends Thread {
  @Override
  public void run() {
    for (int i = 1; i < 1000; i++) {
      System.out.println("Яйцо");
    }
  }
}