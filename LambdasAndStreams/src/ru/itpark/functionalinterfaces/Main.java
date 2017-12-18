package ru.itpark.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    StringModifyRule smileRule = new StringModifyRule() {
      @Override
      public String modify(String string) {
        return string + "=)";
      }
    };

    StringModifyRule screamRule = new StringModifyRule() {
      @Override
      public String modify(String string) {
        return string + "!!!!!!";
      }
    };

    StringModifyRule lambdaScreamRule = (string) -> {
        return string + "!!!!!!";
    };

    List<String> names = new ArrayList<>();
    names.add("Марсель");
    names.add("Дмитрий");
    names.add("Антон");
    names.add("Закир");
    names.add("Лейсан");

    Modifier modifier = new Modifier();

    List<String> smiledNames =
        modifier.modify(names, (string) -> string + " Воу воу!");

    System.out.println(smiledNames);
  }
}
