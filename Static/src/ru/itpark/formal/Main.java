package ru.itpark.formal;

public class Main {
    public static void main(String[] args) {
        System.out.println("someStaticField from SomeClass after initialization: " + SomeClass.someStaticField);
        SomeClass.someStaticField = 500;
        SomeClass a = new SomeClass();
        System.out.println("someField after constructor from a: " + a.someField);
        a.someField = 100;
        a.someStaticField = 50;

        SomeClass b = new SomeClass();
        b.someField = 200;
        b.someStaticField = 150;

        System.out.println("someField from a: " + a.someField );
        System.out.println("someField from b: " + b.someField );

        System.out.println("someStaticField from a: " + a.someStaticField);
        System.out.println("someStaticField from b: " + b.someStaticField);
    }
}
