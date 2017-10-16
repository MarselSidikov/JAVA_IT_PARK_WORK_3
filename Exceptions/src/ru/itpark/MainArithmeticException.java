package ru.itpark;

import java.util.Scanner;

public class MainArithmeticException {

    public static int divNumbers(int a, int b) {
        int result = a / b;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = divNumbers(x, y);
        System.out.println(result);

    }
}
