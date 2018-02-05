package ru.itpark.news.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// аннотация, которая говорит, что
// данный класс будет точкой входа в приложение
// а также содержит конфигурацию приложения
@SpringBootApplication
// аннотация, которая говорит Spring-у
// где искать компоненты для связывания (вспомнить @Autowired, @Component)
@ComponentScan(basePackages = "ru.itpark.news")
// говорим, где лежат классы, которые будут
// объектом взаимодействия с бд
@EntityScan(basePackages = "ru.itpark.news.models")
// говорим, что наши репозитории описаны в данном пакете
// Spring JPA сам сгенерирует для них реализацию
@EnableJpaRepositories(basePackages = "ru.itpark.news.repositories")
// выключили безопасность чтобы было норм
//@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
public class Application {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("*");
      }
    };
  }


  // просто запускаем наше приложение
  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
}
