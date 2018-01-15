package ru.itpark.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itpark.models.User;
import ru.itpark.repository.UsersRepository;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  =
                new ClassPathXmlApplicationContext("ru.itpark/context.xml");

        UsersRepository repository = context.getBean(UsersRepository.class);

        System.out.println(repository.findAll());

        User megaMen = User.builder()
            .name("Мегамен")
            .age(99)
            .citizen("Мегамения")
            .build();

        repository.save(megaMen);
    }
}
