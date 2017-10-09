package ru.itpark.formal;

public class Singleton {
    // объектная переменная, которая хранит только один экземпляр класса
    private final static Singleton instance;

    private Singleton() {
        System.out.println("Instance created");
    }

    static {
        // создали объект
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
