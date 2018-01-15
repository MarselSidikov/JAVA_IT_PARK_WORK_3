package ru.itpark.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itpark.models.User;

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

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL_USERS, (row, rowNumber) -> User.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .build());
    }

    public void save(User model) {

    }
}
