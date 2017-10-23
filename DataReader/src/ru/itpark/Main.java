package ru.itpark;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    DataReader reader = new DataReader("words.txt");
    String word = reader.readString();
    while (word.length() > 0) {
      System.out.println(word);
      word = reader.readString();
    }

    DataReader numbersReader = new DataReader("input.txt");
    int number = numbersReader.readInteger();
    while (number != 0) {
      System.out.println(number);
      number = numbersReader.readInteger();
    }
  }
}
