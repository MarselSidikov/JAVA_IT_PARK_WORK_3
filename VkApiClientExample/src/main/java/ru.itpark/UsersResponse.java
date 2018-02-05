package ru.itpark;

import lombok.Data;

import java.util.List;

@Data
public class UsersResponse {
  private List<UserDto> response;
}
