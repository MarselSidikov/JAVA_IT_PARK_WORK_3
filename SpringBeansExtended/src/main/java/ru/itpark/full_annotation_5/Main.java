package ru.itpark.full_annotation_5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext config
                = new AnnotationConfigApplicationContext(JavaSpringContext.class);

        Restaurant restaurant = config.getBean(Restaurant.class);

        restaurant.welcome();
    }
}
