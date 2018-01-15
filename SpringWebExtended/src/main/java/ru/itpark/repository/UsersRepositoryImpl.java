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

    @PersistenceContext
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
