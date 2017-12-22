package ru.itpark.human;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("context.xml");

    System.out.println("Context loaded");
    Human marsel = context.getBean("marsel", Human.class);
    System.out.println(marsel);

    marsel.setName("Закир");
    Human anotherMarsel = context.getBean("marsel", Human.class);
    System.out.println(anotherMarsel);
  }
}
