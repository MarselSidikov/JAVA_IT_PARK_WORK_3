package ru.itpark.autowired_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaSpringContext {

    @Bean
    public Restaurant restaurant() {
        return new Restaurant();
    }

    @Bean
    public Waiter friendlyWaiter() {
        return new FriendlyWaiterImpl();
    }

    @Bean
    public Waiter grandmotherWaiter() {
        return new GrandmotherWaiterImpl();
    }
}
