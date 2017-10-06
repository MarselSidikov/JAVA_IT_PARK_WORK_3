package ru.itpark.model;

public class Human {
    private final int MIN_AGE_VALUE = 0;
    private final int DEFAULT_AGE_VALUE = 0;
    // поля
    public String name;
    private int age;
    public double height;

    /**
     * Конструктор
     * @param name - имя, поданное на вход
     * @param age - возраст, поданный на вход
     * @param height - рост, поданный на вход
     */
    public Human(String name, int age, double height) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
        setName(name);
        setAge(age);
        setHeight(height);
    }

    // пустой конструктор пришлось написать самим
    public Human() {

    }

    // метод-процедура - поведение
    public void grow() {
        this.age = age + 1;
    }

    public void grow(int years) {
        this.age = age + years;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE_VALUE) {
            this.age = age;
        } else {
            System.err.println("Возраст некорректный.");
            this.age = DEFAULT_AGE_VALUE;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
