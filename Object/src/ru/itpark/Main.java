package ru.itpark;

public class Main {

  public static void main(String[] args) {
    Human marsel = new Human(23, 185);
    Human dima = new Human(29, 180);

    Human marsel2 = new Human(23, 185);

    Human marsel3 = marsel;

    System.out.println(marsel == dima);
    System.out.println(marsel == marsel2);
    System.out.println(marsel3 == marsel);

    System.out.println(marsel.equals(marsel2));
  }
}
