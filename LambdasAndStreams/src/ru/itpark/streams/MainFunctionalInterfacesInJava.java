package ru.itpark.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFunctionalInterfacesInJava {
  public static void main(String[] args) {
    Predicate<String> predicate = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.contains("а");
      }
    };

    Predicate<Integer> integerPredicate =
        (number) -> number % 2 == 0;

    System.out.println(predicate.test("Марсель"));
    System.out.println(integerPredicate.test(105));

    Function<String, Integer> function = new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return s.length();
      }
    };

    System.out.println(function.apply("Марсель"));

    Function<String, Integer> lengthFunction =
        (string) -> string.length();

    System.out.println(lengthFunction.apply("Антон"));

    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s.charAt(0));
      }
    };

    consumer.accept("Закир");

    Consumer<Integer> integerConsumer = (integer) -> {
      integer = integer / 2;
      System.out.println(integer);
    };

    integerConsumer.accept(100);
  }
}
