package ru.itpark.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

// класс Java-конфигурации Spring-а, альтернатива context.xml
// но, тем не менее, может использоваться вместе с ним
@Configuration
public class ApplicationContext {

  // @Autowired - говорит контейнеру, что 
  // в данное поле нужно подставить автоматически 
  // подходящий бин
  @Autowired
  private DataSource dataSource;
  
  // метод, который возвращает бин
  @Bean
  public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource);
  }
}
