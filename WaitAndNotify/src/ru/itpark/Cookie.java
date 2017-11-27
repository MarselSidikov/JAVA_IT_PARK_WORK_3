package ru.itpark;

public class Cookie {
  private boolean isEat = true;

  public Cookie() {
  }

  public void eat() {
    this.isEat = true;
  }

  public void cook() {
    this.isEat = false;
  }

  public boolean isCooked() {
    return !isEat;
  }
}
