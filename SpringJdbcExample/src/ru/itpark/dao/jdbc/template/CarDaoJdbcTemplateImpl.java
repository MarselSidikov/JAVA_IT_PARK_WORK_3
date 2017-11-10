package ru.itpark.dao.jdbc.template;

import ru.itpark.dao.CarDao;
import ru.itpark.models.Car;

import java.util.List;

public class CarDaoJdbcTemplateImpl implements CarDao {
  @Override
  public List<Car> findAllByColor(String color) {
    return null;
  }

  @Override
  public void save(Car model) {

  }

  @Override
  public Car find(int id) {
    return null;
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
