package ru.itis.logger;

public class Main {
    public static void main(String[] args) {
        CommandReader reader = new CommandReader();
        while (true) {
            reader.readCommand();
        }
    }
}
