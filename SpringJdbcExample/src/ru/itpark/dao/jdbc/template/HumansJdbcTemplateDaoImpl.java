package ru.itpark.dao.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import ru.itpark.dao.HumansDao;
import ru.itpark.models.Human;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HumansJdbcTemplateDaoImpl implements HumansDao {
  //language=SQL
  private static final String SQL_INSERT_USER = "INSERT INTO owner(age, name, citizen)" +
      "VALUES (?, ?, ?)";

  //language=SQL
  private static final String SQL_SELECT_USER_BY_ID = "SELECT * FROM owner WHERE " +
      "id = ?";

  //language=SQL
  private static final String SQL_SELECT_USERS = "SELECT * FROM owner";

  private JdbcTemplate template;

  public HumansJdbcTemplateDaoImpl(DataSource dataSource) {
    this.template = new JdbcTemplate(dataSource);
  }

  private RowMapper<Human> humanRowMapper = new RowMapper<Human>() {
    @Override
    public Human mapRow(ResultSet resultSet, int i) throws SQLException {
      return new Human(resultSet.getInt("id"),
          resultSet.getString("name"),
          resultSet.getInt("age"),
          resultSet.getString("citizen"));
    }
  };


  @Override
  public List<Human> findAllByAge(int age) {
    return null;
  }

  @Override
  public void save(Human model) {
    // задача, сохранить model в базу данных
    // и проставить ей сгенерированный бд id-шник

    // создаем объект, который умеет хранить в себе
    // сгенерированные ключи из бд
    KeyHolder keyHolder = new GeneratedKeyHolder();
    // посылаем запрос на создание пользователя
    template.update(
        // передаем PreparedStatement и KeyHolder
        new PreparedStatementCreator() {
          // передаете ему connection к БД
          public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
            // Непосредственно создаете PreparedStatement
            // и говорите, что вам нужен будет id в результате
            PreparedStatement ps =
                connection.prepareStatement(SQL_INSERT_USER, new String[] {"id"});
            // задаете параметры запроса
            ps.setInt(1, model.getAge());
            ps.setString(2, model.getName());
            ps.setString(3, model.getCitizen());
            return ps;
          }
        }, keyHolder);
    // вытащили сгенерированный id из keyHolder и засунули в модель
    model.setId(keyHolder.getKey().intValue());
  }

  @Override
  public Human find(int id) {
    return template.queryForObject(SQL_SELECT_USER_BY_ID, humanRowMapper, id);
  }

  @Override
  public void update(Human model) {

  }

  @Override
  public void delete(int id) {

  }

  @Override
  public List<Human> findAll() {
    return template.query(SQL_SELECT_USERS, humanRowMapper);
  }
}
