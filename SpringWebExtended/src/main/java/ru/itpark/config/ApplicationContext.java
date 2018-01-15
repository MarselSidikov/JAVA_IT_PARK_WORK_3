package ru.itpark.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class ApplicationContext {

  @Autowired
  @Qualifier(value = "dataSource")
  private DataSource dataSource;

  @Bean
  public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource);
  }
}
