package ru.itpark.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itpark.models.Car;
import ru.itpark.models.Human;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarDaoJdbcTemplateImpl implements CarsDao {

    //language=SQL
    private static final String SQL_SELECT_CAR_BY_ID = "SELECT car.*, owner.id as owner_id, owner.* FROM car\n" +
        "JOIN owner ON car.owner_id = owner.id WHERE car.id = ?;";

    private JdbcTemplate template;

    public CarDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private RowMapper<Car> carRowMapper = new RowMapper<Car>() {
        @Override
        public Car mapRow(ResultSet resultSet, int i) throws SQLException {
            Car car =  Car.builder()
                    .id(resultSet.getInt("id"))
                    .number(resultSet.getString("number"))
                    .model(resultSet.getString("model"))
                    .color(resultSet.getString("color"))
                    .build();

          Human owner = Human.builder()
              .id(resultSet.getInt("owner_id"))
              .citizen(resultSet.getString("citizen"))
              .age(resultSet.getInt("age"))
              .name(resultSet.getString("name"))
              .build();

          car.setOwner(owner);

          return car;
        }
    };

    @Override
    public Car find(int id) {
        try {
            return template.queryForObject(SQL_SELECT_CAR_BY_ID, carRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            throw new IllegalArgumentException("Car with id <" + id + "> not found");
        }
    }

    @Override
    public List<Car> findAllByColor(String color) {
        return null;
    }

    @Override
    public List<Car> findByOwnerId(int ownerId) {
        return null;
    }

    @Override
    public List<Car> findAllByModel(String model) {
        return null;
    }

    @Override
    public void save(Car model) {

    }

    @Override
    public void update(Car model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}