package ru.itpark;

import ru.itpark.model.Human;

public class Main {

    public static void main(String[] args) {
        // объявление объектной переменной
	    Human marsel;
	    marsel = new Human(); // создал объект
        marsel.name = "Марсель";
        marsel.setAge(-10);
        System.out.println(marsel.getAge());
        marsel.height = 1.85;

        Human zakir = new Human();
        zakir.name = "Закир";
        zakir.setAge(27);
        zakir.height = 1.86;

        // обе переменные ссылаются на один объект
        Human human = marsel;
        human.setAge(75);
        System.out.println(marsel.getAge());

        Human dima = new Human("Дмитрий", 29, 1.80);
        marsel.grow();
        marsel.grow(12);
    }
}
