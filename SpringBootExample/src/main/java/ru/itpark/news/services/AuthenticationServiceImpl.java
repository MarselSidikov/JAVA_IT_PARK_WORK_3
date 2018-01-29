package ru.itpark.news.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import ru.itpark.news.models.User;
import ru.itpark.news.repositories.UsersRepository;

@Component
public class AuthenticationServiceImpl implements AuthenticationService {

  @Autowired
  private UsersRepository usersRepository;

  @Override
  public User getUserByAuthentication(Authentication authentication) {
    String email = authentication.getName();
    return usersRepository.findByEmail(email).get();
  }
}
