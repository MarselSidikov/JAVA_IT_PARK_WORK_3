package ru.itpark;

public class HashSet<V> {

  private HashMap<V, Object> map;

  public HashSet() {
    map = new HashMap<>();
  }

  private final Object EMPTY_OBJECT = new Object();

  void add(V value) {
    map.put(value, EMPTY_OBJECT);
  }



}
