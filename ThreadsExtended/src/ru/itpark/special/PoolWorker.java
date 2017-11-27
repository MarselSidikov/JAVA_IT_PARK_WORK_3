package ru.itpark.special;

// поток, который принимает на вход какую-либо задачу
// обернутую в интерфейс Runnable и запускает ее
// в фоновом режиме
public class PoolWorker extends Thread {
  private Runnable task;

  public PoolWorker(Runnable task) {
    this.task = task;
  }

  // переопределенный метод run для потока
  public void run() {
    System.out.println(Thread.currentThread().getName());
    // плохое решение
    // создаем новый поток (внутри потока)
    // Thread thread = new Thread(task);
    // запускаем его с переданной задачей
    // thread.start();

    // хорошее решение
    // просто запускаем метод run у задачи, в том же потоке
    // в фоновом режиме
    task.run();
  }
}
