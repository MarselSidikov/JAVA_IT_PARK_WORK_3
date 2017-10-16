package ru.itpark;

public class MainOutOfMemory {
    public static void generateStrings() {
        String numbers[] = new String[2000000000];
    }
    public static void main(String[] args) {
        generateStrings();
    }
}
