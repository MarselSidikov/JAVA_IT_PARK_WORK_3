package ru.itpark.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.news.forms.NamesForm;
import ru.itpark.news.models.User;
import ru.itpark.news.services.AuthenticationService;
import ru.itpark.news.services.UsersService;

import java.util.List;

@Controller
public class UsersController {

  @Autowired
  private UsersService service;

  @Autowired
  private AuthenticationService authenticationService;

  @GetMapping(value = "/profile")
  public String getProfilePage(
      @ModelAttribute("model") ModelMap model,
      Authentication authentication) {
    User user = authenticationService.getUserByAuthentication(authentication);
    model.addAttribute("user", user);
    return "profile";
  }

  @GetMapping(value = "/users")
  public String getUsers(@ModelAttribute("model")ModelMap model,
                         @RequestParam("order_by") String orderBy) {
    List<User> users = service.getUsers(orderBy);
    model.addAttribute("users", users);
    return "users_page";
  }

  @GetMapping("/users/{user-id}")
  public String getUserPage(@ModelAttribute("model") ModelMap model,
                            @PathVariable("user-id") Long userId) {
    User user = service.getUser(userId);
    model.addAttribute("user", user);
    return "user_page";
  }

  @PostMapping("/users/{user-id}")
  @ResponseBody
  public ResponseEntity<Object> updateUser(@PathVariable("user-id") Long userId,
                                           NamesForm form) {
    service.update(userId, form);
    return ResponseEntity.accepted().build();
  }

}
