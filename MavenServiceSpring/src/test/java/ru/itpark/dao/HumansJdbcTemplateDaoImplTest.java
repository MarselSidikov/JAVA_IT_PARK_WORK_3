package ru.itpark.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import ru.itpark.models.Human;

import javax.sql.DataSource;

import static org.junit.Assert.*;

// класс модульного тестирования, в котором содержатся
// тест-методы
public class HumansJdbcTemplateDaoImplTest {
  // объектная переменная, которая хранит объект тестирования
  private HumansJdbcTemplateDaoImpl testedHumansDao;

  // метод, который вызывается перед каждым тест-методом
  @Before
  public void setUp() throws Exception {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test-context.xml");
    DataSource dataSource = context.getBean(DataSource.class);
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