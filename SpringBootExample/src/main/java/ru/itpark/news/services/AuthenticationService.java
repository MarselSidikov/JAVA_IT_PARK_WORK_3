package ru.itpark.news.services;

import org.springframework.security.core.Authentication;
import ru.itpark.news.models.User;

public interface AuthenticationService {
  User getUserByAuthentication(Authentication authentication);
}
