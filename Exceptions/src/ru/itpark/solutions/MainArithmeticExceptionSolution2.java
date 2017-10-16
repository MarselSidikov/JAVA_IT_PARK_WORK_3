package ru.itpark.solutions;

import java.util.Scanner;

public class MainArithmeticExceptionSolution2 {

    public static int divNumbers(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int result = divNumbers(x, y);
                System.out.println(result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Некорректные данные");
            }
        }
    }
}
