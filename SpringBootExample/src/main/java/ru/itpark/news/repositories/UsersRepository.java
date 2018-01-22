package ru.itpark.news.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.news.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {
}
