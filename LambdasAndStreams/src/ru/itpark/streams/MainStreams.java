package ru.itpark.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainStreams {
  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Марсель");
    names.add("Дмитрий");
    names.add("Антон");
    names.add("Закир");
    names.add("Лейсан");
    names.add("Артем");
    names.add("Артем");

//    Stream<String> stringStream = names.stream();
//
//    Stream<String> filteredNames = stringStream
//        .filter((name) -> name.startsWith("А"));
//
//    Stream<Integer> lengthOfNames = filteredNames
//        .map((name) -> name.length());
//
//    lengthOfNames.forEach((length) -> System.out.println(length));

    names.stream()
        .filter((name) -> name.startsWith("А"))
        .map((name) -> name.length())
        .forEach((length) -> System.out.println(length));

    names.stream()
        .filter((name) -> name.startsWith("А"))
        .map(String::length)
        .forEach(System.out::println);

    names.stream()
        .sorted((nameA, nameB) -> nameA.length() - nameB.length())
        .forEach(System.out::println);

    names.stream()
        .sorted(Comparator.comparingInt(String::length))
        .forEach(System.out::println);
  }
}
