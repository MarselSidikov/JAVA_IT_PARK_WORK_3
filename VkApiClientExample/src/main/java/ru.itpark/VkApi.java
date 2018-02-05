package ru.itpark;

import java.util.List;

public interface VkApi {
  List<UserDto> getFriends(int userId);
}
