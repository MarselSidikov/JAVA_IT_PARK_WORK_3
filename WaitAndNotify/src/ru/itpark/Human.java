package ru.itpark;

public class Human extends Thread {

  private Cookie cookie;

  public Human(Cookie cookie) {
    this.cookie = cookie;
  }

  public void eat() {
    // занимаем монитор печенька
    synchronized (cookie) {
      // если печенька все еще не готова
      while (!cookie.isCooked()) {
        // уводим поток Человек в ожидание и освобождаем печеньку
        try {
          cookie.wait();
        } catch (InterruptedException e) {
          throw new IllegalArgumentException(e);
        }
      }
      // если печенька была готова, то мы выходим из верхнего
      // цикла
      System.out.println("Eated");
      // едим печеньку
      cookie.eat();
      // оповещаем потоки, которые ждут на этой самой печеньке
      // о том, что они могут работать дальше
      cookie.notify();
    }
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      eat();
    }
  }
}
