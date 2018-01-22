package ru.itpark.news.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.news.forms.RegistrationForm;
import ru.itpark.news.models.User;
import ru.itpark.news.repositories.UsersRepository;

import java.time.LocalDateTime;

@Service
public class RegistrationServiceImpl implements RegistrationService {

  @Autowired
  private UsersRepository usersRepository;

  private PasswordEncoder encoder = new BCryptPasswordEncoder();

  @Override
  public Long registration(RegistrationForm form) {
    String hashPassword = encoder.encode(form.getPassword());
    LocalDateTime registrationTime = LocalDateTime.now();

    User newUser = User.builder()
        .name(form.getName())
        .email(form.getEmail())
        .surname(form.getSurname())
        .hashPassword(hashPassword)
        .registrationTime(registrationTime)
        .build();

    usersRepository.save(newUser);
    return newUser.getId();
  }
}
