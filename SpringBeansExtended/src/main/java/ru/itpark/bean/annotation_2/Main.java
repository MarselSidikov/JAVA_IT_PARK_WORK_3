package ru.itpark.bean.annotation_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaSpringContext.class);

        Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
        restaurant.welcome();
    }
}
