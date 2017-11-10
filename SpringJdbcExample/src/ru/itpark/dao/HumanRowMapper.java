package ru.itpark.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.itpark.models.Human;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HumanRowMapper implements RowMapper<Human> {
  @Override
  public Human mapRow(ResultSet resultSet, int i) throws SQLException {
    return new Human(resultSet.getInt("id"),
        resultSet.getString("name"),
        resultSet.getInt("age"),
        resultSet.getString("citizen"));
  }
}
