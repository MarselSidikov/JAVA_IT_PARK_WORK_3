package ru.itpark;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {

  private T elements[];
  private int count;

  public ArrayList() {
    this.elements = (T[])new Object[10];
    this.count = 0;
  }

  public void add(T element) {
    this.elements[count++] = element;
  }

  public T get(int index) {
    return elements[index];
  }

  public int size() {
    return count;
  }

  private class ArrayListIterator implements Iterator<T> {

    private int current = 0;

    public boolean hasNext() {
      return current < count;
    }

    public T next() {
      T element = elements[current];
      current++;
      return element;
    }
  }

  public Iterator<T> iterator() {
    return new ArrayListIterator();
  }

  public void swap(int i, int j) {
    T temp = elements[i];
    elements[i] = elements[j];
    elements[j] = temp;
  }
}
