package ru.itpark;

public class ArrayOfEntriesMap<K, V> {
  // описываем еще один параметризованный класс
  private static class Entry<E, T> {
    private E key;
    private T value;
  }
  // массив элементов Мапа, то есть каждый элемент
  // массива представляет собой пару ключ-значение
  private Entry<K, V> entries[];
  private int count = 0;

  public ArrayOfEntriesMap() {
    this.entries = new Entry[10];
  }

  public void put(K key, V value) {

    for (int i = 0; i < count; i++) {
      if (entries[i].key.equals(key)) {
        entries[i].value = value;
        return;
      }
    }

    Entry<K, V> entry = new Entry();
    entry.key = key;
    entry.value = value;

    entries[count] = entry;
    count++;
  }

  public V get(K key) {
    for (int i = 0; i < count; i++) {
      if (entries[i].key.equals(key)) {
        return entries[i].value;
      }
    }
    return null;
  }
}
