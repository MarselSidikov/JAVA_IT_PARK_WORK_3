package ru.itpark;

public class Lists {
  public static <T extends Comparable<T>>
  void bubbleSort(ArrayList<T> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (list.get(j).compareTo(list.get(j+1)) > 0) {
          list.swap(j, j + 1);
        }
      }
    }
  }
}
