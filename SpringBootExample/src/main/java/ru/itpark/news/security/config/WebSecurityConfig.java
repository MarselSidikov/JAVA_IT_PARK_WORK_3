package ru.itpark.news.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// WebSecurityConfigurerAdapter - класс
// переопределение методов которого позволяет
// настроить безопасность
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests() // блок, отвечающий за урлы и их доступы
          .antMatchers("/registration/**").permitAll() // разрешили всем
          .antMatchers("/confirm/**").permitAll()
          .antMatchers("/css/**").permitAll()
          .antMatchers("/js/**").permitAll()
          .antMatchers("/profile/**").hasAnyAuthority("USER", "ADMIN") // разрешили админу и пользователям
          .antMatchers("/users/**").hasAnyAuthority("ADMIN") // только админу
          .anyRequest().authenticated() // все остальные запросы требуют предварительной авторизации
            .and()
        .formLogin() // блок с формой входа
          .loginPage("/login")
          .usernameParameter("email")
          .passwordParameter("password")
          .defaultSuccessUrl("/profile")
          .failureUrl("/login?error=true")
        .permitAll()
        .and()
        .csrf().disable();
  }

  @Autowired
  private UserDetailsService userDetailsService;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
  }
}
