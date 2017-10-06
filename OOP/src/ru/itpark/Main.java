package ru.itpark;

public class Main {

    public static void main(String[] args) {
        // объявление объектной переменной
	    Human marsel;
	    marsel = new Human(); // создал объект
        marsel.name = "Марсель";
        marsel.age = 23;
        marsel.height = 1.85;

        Human zakir = new Human();
        zakir.name = "Закир";
        zakir.age = 27;
        zakir.height = 1.86;

        // обе переменные ссылаются на один объект
        Human human = marsel;
        human.age = 75;
        System.out.println(marsel.age);

        Human dima = new Human("Дмитрий", 29, 1.80);
        marsel.grow();
        marsel.grow(12);
    }
}
