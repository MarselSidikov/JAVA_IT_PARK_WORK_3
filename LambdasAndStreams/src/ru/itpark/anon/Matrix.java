package ru.itpark.anon;

// интерфейс Матрица, которая может
// хранить в виде матрицы
// объекты любого типа T
public interface Matrix<T> {
  void set(int i, int j, T value);
  T get(int i, int j);
}
