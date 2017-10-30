package ru.itpark;

public class Animal {
  private String alias;
  private String breed;

  public Animal(String alias, String breed) {
    this.alias = alias;
    this.breed = breed;
  }

  public String getAlias() {
    return alias;
  }

  public String getBreed() {
    return breed;
  }
}
