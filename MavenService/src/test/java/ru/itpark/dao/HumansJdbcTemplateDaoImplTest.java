package ru.itpark.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.models.Human;

import static org.junit.Assert.*;

// класс модульного тестирования, в котором содержатся
// тест-методы
public class HumansJdbcTemplateDaoImplTest {
  // объектная переменная, которая хранит объект тестирования
  private HumansJdbcTemplateDaoImpl testedHumansDao;

  // метод, который вызывается перед каждым тест-методом
  @Before
  public void setUp() throws Exception {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUsername("postgres");
    dataSource.setPassword("Zaq12wsx");
    dataSource.setUrl("jdbc:postgresql://localhost:5432/sidikov_db");
    testedHumansDao = new HumansJdbcTemplateDaoImpl(dataSource);
  }

  @Test
  public void findTest() throws Exception {
    Human expected = Human.builder()
        .id(2)
        .age(19)
        .name("Андрей")
        .citizen("Россия")
        .build();

    Human actual = testedHumansDao.find(2);

    Assert.assertEquals(expected, actual);
  }

  // тест не провален, если снегерировал исключение на
  // плохом id
  @Test(expected = IllegalArgumentException.class)
  public void findTestOnBadUserId() {
    testedHumansDao.find(44);
  }

}