package ru.itpark.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itpark.models.User;
import ru.itpark.repository.UsersRepository;

/**
 * Hibernate - ORM-фреймворк, реализует JPA
 * JPA (javax.persistance) - набор интерфейсов и аннотаций для описания принципов ORM в JAVA
 *  -> @Table, @Entity, @PersistanceContext, @Column, @OneToMany, EntityManager ...
 * Spring Data JPA - фреймворк, который объединяет просто JPA и Spring
 */
public class Main {
    public static void main(String[] args) {
        // контекст, который описан в xml файле
        ClassPathXmlApplicationContext context  =
                new ClassPathXmlApplicationContext(
                    "ru.itpark/context.xml");
        // получаем бин типа UsersRepository из контекста
        UsersRepository repository
            = context.getBean(UsersRepository.class);

        // выводим содержимое базы данных
        System.out.println(repository.findAll());

        // создаем объект
        User megaMen = User.builder()
            .name("Мегамен")
            .age(99)
            .citizen("Мегамения")
            .build();
        // сохраняем в бд
        repository.save(megaMen);
    }
}
