package ru.itpark;

public class Human {
  public String name;
  public int age;
  private int height;

  public int getHeight() {
    return height;
  }

  public void go() {
    System.out.println("я " + name + " и я погулял");
  }

  public void go(int km) {
    System.out.println("я " + name + " и я прошел " + km);
  }
}
