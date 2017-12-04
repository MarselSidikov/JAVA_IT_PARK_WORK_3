package ru.itpark.figures;

public class Human {
  private int age;
  private int height;
  private String citizen;

  public Human() {
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getCitizen() {
    return citizen;
  }

  public void setCitizen(String citizen) {
    this.citizen = citizen;
  }

  @Override
  public String toString() {
    return "Human{" +
        "age=" + age +
        ", height=" + height +
        ", citizen='" + citizen + '\'' +
        '}';
  }
}
