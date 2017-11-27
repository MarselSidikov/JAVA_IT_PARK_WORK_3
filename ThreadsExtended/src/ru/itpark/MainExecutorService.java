package ru.itpark;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutorService {
  public static void main(String[] args) {
    List<String> mails = new ArrayList<>();
    ExecutorService service = Executors.newFixedThreadPool(5);

    for (int i = 0; i < 10000; i++) {
      mails.add(UUID.randomUUID().toString() + "@gmail.com");
    }

    MailSender sender = new MailSender();

    for (String mail : mails) {
      service.submit(() -> sender.sendMail(mail, "hello"));
    }
  }
}
