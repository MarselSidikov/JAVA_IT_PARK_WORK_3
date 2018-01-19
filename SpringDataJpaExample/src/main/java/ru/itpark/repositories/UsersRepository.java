package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
  List<User> findAllByAgeAndCitizen(int age, String citizen);
}
