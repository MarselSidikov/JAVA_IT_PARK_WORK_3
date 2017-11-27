package ru.itpark;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
  public static void main(String[] args) {
    List<String> mails = new ArrayList<>();
    ThreadPool threadPool = new ThreadPool(5);
    for (int i = 0; i < 10000; i++) {
      mails.add(UUID.randomUUID().toString() + "@gmail.com");
    }

    MailSender sender = new MailSender();

    for (String mail : mails) {
      threadPool.submitTask(() -> sender.sendMail(mail, "hello"));
    }
  }
}
