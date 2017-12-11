package ru.itpark.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itpark.models.Car;
import ru.itpark.models.Human;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class HumansJdbcTemplateDaoImpl implements HumansDao {

    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID = "SELECT * FROM owner " +
            "WHERE owner.id = ?";

    private JdbcTemplate template;

    private Map<Integer, Human> humansMap;

    public HumansJdbcTemplateDaoImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
        humansMap = new HashMap<>();
    }

    private RowMapper<Human> humanRowMapper = (resultSet, i) -> Human.builder()
            .id(resultSet.getInt("id"))
            .age(resultSet.getInt("age"))
            .name(resultSet.getString("name"))
            .citizen(resultSet.getString("citizen"))
            .build();

    private RowMapper<Human> humanRowMapperWithCars = new RowMapper<Human>() {
        @Override
        public Human mapRow(ResultSet resultSet, int i) throws SQLException {
            Human human = humanRowMapper.mapRow(resultSet, i);
            human.setCars(new ArrayList<>());
            if (humansMap.get(human.getId()) == null) {
                humansMap.put(human.getId(), human);
            }
            if (resultSet.getInt(5) != 0) {
                Car car = new Car(
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        humansMap.get(resultSet.getInt(9)));
                int ownerId = resultSet.getInt(9);
                Human owner = humansMap.get(ownerId);
                owner.getCars().add(car);
            }
            return human;
        }
    };


    @Override
    public List<Human> findAllByAge(int age) {
        return null;
    }

    @Override
    public void save(Human model) {

    }

    @Override
    public Human find(int id) {
        try {
            return template.queryForObject(SQL_SELECT_USER_BY_ID, humanRowMapper, id);
        } catch (EmptyResultDataAccessException e) {
            throw new IllegalArgumentException("User with id <" + id + "> not found");
        }
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