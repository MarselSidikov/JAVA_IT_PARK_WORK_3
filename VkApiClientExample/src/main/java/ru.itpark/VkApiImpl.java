package ru.itpark;

import org.springframework.web.client.RestTemplate;

import java.util.List;

public class VkApiImpl implements VkApi {

  private RestTemplate restTemplate;

  VkApiImpl() {
    restTemplate = new RestTemplate();
  }

  public List<UserDto> getFriends(int userId) {
    UsersResponse response = restTemplate.getForObject(
        "https://api.vk.com/method/friends.get?user_id=" + userId + "" +
            "&fields=sex,bdate,city,country,photo_200_orig",
        UsersResponse.class);
    return response.getResponse();
  }
}
