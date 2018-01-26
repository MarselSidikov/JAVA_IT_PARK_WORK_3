package ru.itpark.news.services;

import ru.itpark.news.forms.NamesForm;
import ru.itpark.news.models.User;

import java.util.List;

public interface UsersService {
  List<User> getUsers(String orderBy);

  User getUser(Long userId);

  void update(Long userId, NamesForm form);
}
