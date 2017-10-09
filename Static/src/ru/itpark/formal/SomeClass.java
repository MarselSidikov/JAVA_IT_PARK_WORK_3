package ru.itpark.formal;

public class SomeClass {
    // обычное поле
    // для каждого объекта оно свое
    int someField;

    SomeClass() {
        someField = 10;
    }

    static int someStaticField;

    // статически инициализатор
    static {
        someStaticField = 400;
    }

    void someMethod() {
        System.out.println("someMethod with someField: " + someField);
        System.out.println("someMethod with someStaticField: " + someStaticField);
    }

    static void someStaticMethod() {
        // System.out.println("someMethod with someField: " + someField);
        System.out.println("someMethod with someStaticField: " + someStaticField);
    }
}
