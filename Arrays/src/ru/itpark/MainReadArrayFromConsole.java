package ru.itpark;

import java.util.Scanner;

public class MainReadArrayFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считываю размер массива
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];

        // array[0] = scanner.nextInt()
        // array[1] = scanner.nextInt()
        // int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);
        // запомнили стоимость айфона
        int min = array[0];
        // а теперь посмотрим остальные
        for (int i = 1; i < array.length; i++) {
            // если стоимость текущего телефона
            // оказаль меньше, чем то, что вы запонили до этого
            // запоминаем новую стоимость
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

    }
}
