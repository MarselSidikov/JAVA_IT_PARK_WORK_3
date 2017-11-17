package ru.itpark;

public class Main {

    public static void main(String[] args) {
      Integer i1 = 124;
      Integer i2 = 124;

      System.out.println(i1 == i2);

      System.out.println(i1.hashCode());

      Long l = 124L;

      System.out.println(l.hashCode());
    }
}
