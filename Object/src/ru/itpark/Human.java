package ru.itpark;

public class Human {
  private int age;
  private int height;

  public Human(int age, int height) {
    this.age = age;
    this.height = height;
  }

  public int getAge() {
    return age;
  }

  public int getHeight() {
    return height;
  }

  public boolean equals(Object object) {
    if ( object == null || !(object instanceof Human)) {
      return false;
    }

    if (this == object) {
      return true;
    }

    Human that = (Human)object;
    return this.age == that.age &&
        this.height == that.height;
  }
}
