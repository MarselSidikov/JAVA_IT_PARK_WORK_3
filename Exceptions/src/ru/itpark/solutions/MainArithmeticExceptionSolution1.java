package ru.itpark.solutions;

import java.util.Scanner;

public class MainArithmeticExceptionSolution1 {

    public static int divNumbers(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (y == 0) {
            System.out.println("Введите корректные числа");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        int result = divNumbers(x, y);
        System.out.println(result);

    }
}
