package ru.itpark.figures;

public class Rectangle {

  private String name;
  private int a;
  private int b;

  public Rectangle() {
  }

  public Rectangle(String name, int a, int b) {
    this.name = name;
    this.a = a;
    this.b = b;
  }

  public String getName() {
    return name;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "name='" + name + '\'' +
        ", a=" + a +
        ", b=" + b +
        '}';
  }
}
