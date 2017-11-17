package ru.itpark.models;

public class Car {
  private int id;
  private String number;
  private String color;
  private String model;
  private Human owner;

  public Car(int id, String model, String number, String color, Human owner) {
    this.id = id;
    this.number = number;
    this.color = color;
    this.model = model;
    this.owner = owner;
  }

  public Car(String number, String color, String model) {
    this.number = number;
    this.color = color;
    this.model = model;
  }

  public int getId() {
    return id;
  }

  public String getNumber() {
    return number;
  }

  public String getColor() {
    return color;
  }

  public String getModel() {
    return model;
  }


  public void setId(int id) {
    this.id = id;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setOwner(Human owner) {
    this.owner = owner;
  }

  public Human getOwner() {
    return owner;
  }
}
