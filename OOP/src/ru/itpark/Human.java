package ru.itpark;

public class Human {
    // поля
    String name;
    int age;
    double height;

    /**
     * Конструктор
     * @param name - имя, поданное на вход
     * @param age - возраст, поданный на вход
     * @param height - рост, поданный на вход
     */
    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // пустой конструктор пришлось написать самим
    public Human() {

    }

    // метод-процедура - поведение
    void grow() {
        this.age = age + 1;
    }

    void grow(int years) {
        this.age = age + years;
    }
}
