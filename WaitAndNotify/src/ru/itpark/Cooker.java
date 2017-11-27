package ru.itpark;

public class Cooker extends Thread {

  private Cookie cookie;

  public Cooker(Cookie cookie) {
    this.cookie = cookie;
  }

  public void cook() {
    // занимает монитор "печенька"
    synchronized (cookie) {
      // если печенька все еще готова
      while (cookie.isCooked()) {
        try {
          // уводим поток Повара в ожидание, и при этом
          // освобождаем монитор
          cookie.wait();
        } catch (InterruptedException e) {
          throw new IllegalArgumentException(e);
        }
      }
      // если печеньку поели
      System.out.println("Cooked");
      // готовим ее
      cookie.cook();
      // оповещаем все потоки, которые сидели на данной печеньке
      // в режиме ожидания о том, что печенька готова.
      cookie.notify();
    }
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      cook();
    }
  }
}
