package ru.itpark;

public class VkApiBuilder {
  public static VkApi build() {
    return new VkApiImpl();
  }
}
