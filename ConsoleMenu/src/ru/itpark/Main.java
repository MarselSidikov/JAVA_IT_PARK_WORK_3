package ru.itpark;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String document[] = new String[3];
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showMenu();

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    DocumentUtil.showDocument(document);
                }
                break;
                case 2: {
                    if (DocumentUtil.count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    DocumentUtil.addLineToBegin(document, newLine);
                }
                break;
                case 3: {
                    if (DocumentUtil.count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    DocumentUtil.addLineToEnd(document, newLine);
                }
                break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
