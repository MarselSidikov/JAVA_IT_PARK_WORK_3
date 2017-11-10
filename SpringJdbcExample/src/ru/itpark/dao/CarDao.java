package ru.itpark.dao;

import ru.itpark.models.Car;

import java.util.List;

public interface CarDao extends CrudDao<Car> {
  List<Car> findAllByColor(String color);
}
