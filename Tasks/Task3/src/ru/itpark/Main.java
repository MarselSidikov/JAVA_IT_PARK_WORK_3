package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Считать код символа
        // например, 1041
        // вывести символ, который соответвует этому коду
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        char character = (char)code;
        System.out.println(character);
    }
}
