package ru.itpark.dao;

import ru.itpark.models.Human;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class HumansDaoJdbcImpl implements HumansDao {

  private Connection connection;

  public HumansDaoJdbcImpl(DataSource dataSource) {
    try {
      connection = dataSource.getConnection();
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
  }

    @Override
    public Human find(int id) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM owner WHERE owner.id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Human human = null;
            while (resultSet.next()) {
                human = Human.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .age(resultSet.getInt("age"))
                        .citizen(resultSet.getString("citizen"))
                        .build();
            }
            if (human == null) {
                throw new IllegalArgumentException("User with id <" + id + "> not found");
            } else return human;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Human> findAllByAge(int age) {
        return null;
    }

    @Override
    public void save(Human model) {

    }

    @Override
    public void update(Human model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Human> findAll() {
        return null;
    }
}