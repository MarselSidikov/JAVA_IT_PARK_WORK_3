package ru.itpark.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.news.models.User;
import ru.itpark.news.services.UsersService;

import java.util.List;

@Controller
public class UsersController {

  @Autowired
  private UsersService service;

  @GetMapping(value = "/users")
  public String getUsers(@ModelAttribute("model")ModelMap model,
                         @RequestParam("order_by") String orderBy) {
    List<User> users = service.getUsers(orderBy);
    model.addAttribute("users", users);
    return "users_page";
  }
}
