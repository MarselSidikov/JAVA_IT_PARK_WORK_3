package ru.itpark.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.news.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
  List<User> findByOrderByRegistrationTimeDesc();
  List<User> findByOrderById();
  List<User> findByOrderByName();
}
