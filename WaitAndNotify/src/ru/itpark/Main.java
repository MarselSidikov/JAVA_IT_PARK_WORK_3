package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Cookie cookie = new Cookie();

        Human human = new Human(cookie);
        Cooker cooker = new Cooker(cookie);

        human.start();
        cooker.start();
    }
}
