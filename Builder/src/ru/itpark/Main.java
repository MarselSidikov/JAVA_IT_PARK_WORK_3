package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Human human = Human.builder()
                .age(23).name("Марсель").height(1.85)
                .color("Blackman")
                .weight(62)
                .dressSize("M")
                .build();



    }
}
