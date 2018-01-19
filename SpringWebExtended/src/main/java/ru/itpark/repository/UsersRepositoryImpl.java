package ru.itpark.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component(value = "usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

    //language=SQL
    private static final String SQL_SELECT_ALL_USERS =
            "SELECT * FROM owner";

    @Autowired
    private JdbcTemplate template;

    // entityManager - альтернатива
    // sessionFactory
    // EntityManager - стандартизирован джавой JPA
    // Вопрос - откуда мы его берем? Мы берем его из
    // ORM-фреймворка, но с важной оговоркой -
    // не чистый Hibernate, а приправленный Spring-ом

    // Чтобы создать EntityManager нужны три вещи
    // 1) Менеджер транзакций (замена entityManager.getTransaction().begin()
    // и entityManager.getTransaction().commit()
    // 2) Фабрика EntityManager-ов
    // 3) Адаптер, который сможет настроить ваш EntityManager
    // на конкретную реализацию ORM-фреймворка (например hibernate)
    // @PersistenceContext вместо @Autowired, почему?
    // Потому что созданием EntityManagero-в занимается
    // Spring через LocalContainerEntityManagerFactoryBean
    @PersistenceContext // не аннотация Spring-а!!!!
    private EntityManager entityManager;

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL_USERS, (row, rowNumber) -> User.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .build());
    }

    @Transactional
    public void save(User model) {
        //entityManager.getTransaction().begin();
        entityManager.persist(model);
        //entityManager.getTransaction().commit();
    }
}
