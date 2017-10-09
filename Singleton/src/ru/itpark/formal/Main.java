package ru.itpark.formal;

import ru.itpark.formal.Singleton;

public class Main {

    public static void main(String[] args) {
        // Singleton singleton = new Singleton();
        System.out.println("Start application");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
    }
}
