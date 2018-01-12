package ru.itpark.autowired_ft_xml_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context-2.xml");

        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.welcome();
    }
}
