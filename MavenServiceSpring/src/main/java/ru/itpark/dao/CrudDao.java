package ru.itpark.dao;

import java.util.List;

/**
 * Параметризированный интерфейс, который описывает
 * базовые методы для работы с данными - CRUD
 * Данный интерфейс позволяет не писать по сто раз эти CRUD-методы
 * В потомке наследуем данный интерфейс, указывая конкретный тип модели
 * и все эти методы автоматически попадают в наш интерфейс-потомок
 * @param <T> - тип модели, с которой мы работаем в DAO
 */
public interface CrudDao<T> {
  void save(T model);
  T find(int id);
  void update(T model);
  void delete(int id);

  List<T> findAll();
}
