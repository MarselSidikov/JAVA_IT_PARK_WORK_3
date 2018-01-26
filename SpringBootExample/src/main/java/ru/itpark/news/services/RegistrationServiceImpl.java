package ru.itpark.news.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.news.forms.RegistrationForm;
import ru.itpark.news.models.State;
import ru.itpark.news.models.User;
import ru.itpark.news.repositories.UsersRepository;

import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class RegistrationServiceImpl implements RegistrationService {

  @Autowired
  private UsersRepository usersRepository;

  @Autowired
  private JavaMailSender javaMailSender;

  private PasswordEncoder encoder = new BCryptPasswordEncoder();

  @Override
  @SneakyThrows
  public String registration(RegistrationForm form) {
    String hashPassword = encoder.encode(form.getPassword());
    LocalDateTime registrationTime = LocalDateTime.now();
    String confirmString = UUID.randomUUID().toString().replace("-","");

    User newUser = User.builder()
        .name(form.getName())
        .confirmCode(confirmString)
        .expiredDate(LocalDateTime.now().plusHours(3))
        .email(form.getEmail())
        .surname(form.getSurname())
        .hashPassword(hashPassword)
        .registrationTime(registrationTime)
        .build();

    usersRepository.save(newUser);

    String text = "<a href=\"localhost/confirm/" +newUser.getConfirmCode()+ "\">Пройдите по ссылке</a>";

    MimeMessage message = javaMailSender.createMimeMessage();
    message.setContent(text, "text/html");
    MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
    messageHelper.setTo(newUser.getEmail());
    messageHelper.setSubject("Подтверждение регистрации");
    messageHelper.setText(text, true);

    javaMailSender.send(message);

    return newUser.getEmail();
  }

  @Override
  public boolean confirm(String confirmString) {
    Optional<User> userOptional
        = usersRepository.findByConfirmCode(confirmString);
    if (userOptional.isPresent()) {
      User user = userOptional.get();

      if (LocalDateTime.now().isAfter(user.getExpiredDate())) {
        return false;
      }

      user.setConfirmCode(null);
      user.setExpiredDate(null);
      user.setState(State.CONFIRMED);
      usersRepository.save(user);

      return true;
    }
    return false;
  }
}
