package ru.itpark.messages;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("context.xml");

    MessageRenderer renderer =
        context.getBean("renderer", MessageRenderer.class);

    renderer.render();
  }
}
