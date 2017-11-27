package ru.itpark;

public class MailSender {
  public void sendMail(String mail, String text) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
    System.out.println(Thread.currentThread().getName() + ":" + text + " sended to" + mail);
  }
}
