package ru.itpark.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.news.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
  List<User> findByOrderByRegistrationTimeDesc();
  List<User> findByOrderById();
  List<User> findByOrderByName();

  Optional<User> findByConfirmCode(String confirmCode);
  Optional<User> findByEmail(String email);
}
