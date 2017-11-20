package ru.itpark;

public class SomeThread implements Runnable {
  @Override
  public void run() {
    System.out.println("А вот и я вмешался");
  }
}
