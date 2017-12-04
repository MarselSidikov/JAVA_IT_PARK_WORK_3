package ru.itpark;

public class Main {
  public static void main(String[] args) {
    RationalNumber x = RationalNumber.create(15, 9);
    x.optimize();
    System.out.println(x);
  }
}
