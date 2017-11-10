package ru.itpark;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.dao.HumansDao;
import ru.itpark.dao.jdbc.template.HumansJdbcTemplateDaoImpl;
import ru.itpark.models.Human;

public class Main {



  public static void main(String[] args) {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUsername("postgres");
    dataSource.setPassword("Zaq12wsx");
    dataSource.setUrl("jdbc:postgresql://localhost:5432/sidikov_db");

    HumansDao humansDao = new HumansJdbcTemplateDaoImpl(dataSource);
    Human avraam = new Human("Авраам", 75, "Израиль");

    System.out.println(avraam);
    humansDao.save(avraam);
    System.out.println(avraam);



  }
}

