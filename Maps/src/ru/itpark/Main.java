package ru.itpark;

public class Main {

    public static void main(String[] args) {
      ArrayOfValuesMap arrayOfValuesMap = new ArrayOfValuesMap();

      int hash = arrayOfValuesMap.hash("Марсель");
      int hash1 = arrayOfValuesMap.hash("Марсеьл");
      int hash2 = arrayOfValuesMap.hash("Дмитрий");

      System.out.println(hash);
      System.out.println(hash1);
      System.out.println(hash2);
    }
}
