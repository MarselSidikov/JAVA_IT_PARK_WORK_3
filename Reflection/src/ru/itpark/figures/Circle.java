package ru.itpark.figures;

public class Circle {
  private String name;
  private int radius;

  public Circle() {
  }

  public Circle(String name, int radius) {
    this.name = name;
    this.radius = radius;
  }

  public String getName() {
    return name;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "name='" + name + '\'' +
        ", radius=" + radius +
        '}';
  }
}
