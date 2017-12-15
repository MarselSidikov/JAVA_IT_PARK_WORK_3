package ru.itpark.human;

import lombok.ToString;

@ToString
public class Human {
  private int age;
  private String name;
  private double height;

  public Human() {
    System.out.println("Human constructor invoked");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
