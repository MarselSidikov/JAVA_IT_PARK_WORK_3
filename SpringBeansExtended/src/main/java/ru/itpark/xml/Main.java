package ru.itpark.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Restaurant restaurant =
                context.getBean("restaurant", Restaurant.class);

        restaurant.welcome();
    }
}
