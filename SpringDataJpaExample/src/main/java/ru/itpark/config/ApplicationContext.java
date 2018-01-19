package ru.itpark.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource(value = "db.properties")
@ComponentScan(value = "ru.itpark")
@EnableJpaRepositories(basePackages = "ru.itpark.repositories")
@EnableTransactionManagement
public class ApplicationContext {

  @Autowired
  private Environment environment;

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean emf =
        new LocalContainerEntityManagerFactoryBean();

    emf.setDataSource(dataSource());
    emf.setPackagesToScan("ru.itpark.models");

    HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    adapter.setDatabase(Database.POSTGRESQL);

    emf.setJpaVendorAdapter(adapter);
    emf.setJpaProperties(jpaProperties());

    return emf;
  }

  @Bean
  public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
    JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(entityManagerFactory);
    return transactionManager;
  }

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUrl(environment.getProperty("datasource.url"));
    dataSource.setDriverClassName(environment.getProperty("datasource.driver"));
    dataSource.setUsername(environment.getProperty("datasource.username"));
    dataSource.setPassword(environment.getProperty("datasource.password"));
    return dataSource;

  }

  public Properties jpaProperties() {
    Properties properties = new Properties();
    properties.setProperty("hibernate.dialect",
        environment.getProperty("hibernate.dialect"));
    properties.setProperty("hibernate.show_sql",
        environment.getProperty("hibernate.show_sql"));
    properties.setProperty("hibernate.hbm2ddl.auto",
        environment.getProperty("hibernate.hbm2ddl.auto"));
    return properties;
  }
}
