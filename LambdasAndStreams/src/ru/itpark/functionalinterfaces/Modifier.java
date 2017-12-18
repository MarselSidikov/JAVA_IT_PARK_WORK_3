package ru.itpark.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Modifier {
  public List<String> modify(List<String> strings,
                             StringModifyRule rule) {
    List<String> result = new ArrayList<>();
    for (String string : strings) {
      String newString = rule.modify(string);
      result.add(newString);
    }

    return result;
  }
}
