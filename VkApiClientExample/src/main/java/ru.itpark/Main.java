package ru.itpark;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    VkApi vkApi = VkApiBuilder.build();

    List<UserDto> friends = vkApi.getFriends(207764);
    System.out.println(friends);
  }
}
