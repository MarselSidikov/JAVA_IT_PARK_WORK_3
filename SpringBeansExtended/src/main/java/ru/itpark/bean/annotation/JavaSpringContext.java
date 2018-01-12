package ru.itpark.bean.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaSpringContext {

    @Bean
    public Restaurant restaurant() {
        Restaurant restaurant = new Restaurant();
        restaurant.setWaiter(waiter());
        return restaurant;
    }

    @Bean
    public Waiter waiter() {
        return new FriendlyWaiterImpl();
    }
}
