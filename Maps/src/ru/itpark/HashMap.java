package ru.itpark;

public class HashMap<K, V> {

  private static class Node<T, E> {
    private T key;
    private E value;
    private Node<T, E> next;
  }

  private Node<K, V> buckets[];

  public HashMap() {
    this.buckets = new Node[16];
  }

  public void put(K key, V value) {
    int hash = key.hashCode();
    int h = hash >>> 16;

    hash = hash ^ h;

    int index = hash & (buckets.length - 1);

    if (buckets[index] == null) {
      Node<K, V> newNode = new Node<>();
      newNode.key = key;
      newNode.value = value;
      buckets[index] = newNode;
    } else {
      Node<K, V> current = buckets[index];
      while (current.next != null) {
        if (current.key.equals(key)) {
          current.value = value;
          return;
        }
        current = current.next;
      }
      if (current.key.equals(key)) {
        current.value = value;
        return;
      }
      Node<K, V> newNode = new Node<>();
      newNode.key = key;
      newNode.value = value;
      current.next = newNode;
    }
  }

  public V get(K key) {
    int hash = key.hashCode();
    int h = hash >>> 16;

    hash = hash ^ h;

    int index = hash & (buckets.length - 1);

    Node<K, V> current = buckets[index];

    while (current != null) {
      if (current.key.equals(key)) {
        return current.value;
      }
      current = current.next;
    }
    return null;
  }
}
