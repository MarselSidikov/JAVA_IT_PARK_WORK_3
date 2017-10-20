package ru.itpark.lists;

public interface List {
    void add(int element);
    void addToBegin(int element);
    Iterator iterator();
}
