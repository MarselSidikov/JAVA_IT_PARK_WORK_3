package ru.itpark.news.services;

import ru.itpark.news.models.User;

import java.util.List;

public interface UsersService {
  List<User> getUsers(String orderBy);
}
