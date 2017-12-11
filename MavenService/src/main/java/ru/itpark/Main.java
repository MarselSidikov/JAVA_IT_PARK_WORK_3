package ru.itpark;

import ru.itpark.dao.CarDaoJdbcTemplateImpl;
import ru.itpark.dao.CarsDao;

import javax.sql.DataSource;

public class Main {
  public static void main(String[] args) {

    CarsDao carsDao = ComponentsFactory.carsDao();
    System.out.println(carsDao.find(2));

  }
}
