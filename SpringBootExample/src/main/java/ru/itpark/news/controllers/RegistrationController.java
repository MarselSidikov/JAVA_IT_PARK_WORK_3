package ru.itpark.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.news.forms.RegistrationForm;
import ru.itpark.news.services.RegistrationService;

@Controller
public class RegistrationController {

  @Autowired
  private RegistrationService service;

  @PostMapping("/registration")
  public String registrationUser(@ModelAttribute RegistrationForm form,
                                 @ModelAttribute("model") ModelMap model) {
    String email = service.registration(form);
    model.addAttribute("email", email);
    return "success";
  }

  @GetMapping("/registration")
  public String getRegistrationPage() {
    return "registration_page";
  }

  @GetMapping("/confirm/{confirm-string}")
  public String getConfirmPage(
      @ModelAttribute("model") ModelMap model,
      @PathVariable("confirm-string") String confirmString) {
    boolean result = service.confirm(confirmString);
    model.addAttribute("result", result);
    return "confirm_result_page";
  }
}
