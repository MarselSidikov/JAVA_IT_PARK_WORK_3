package ru.itpark;

import java.util.Arrays;

public class ArraysAsDataType {
    public static void main(String[] args) {
        // объявление переменной массива
        int a[];
        // выделение памяти для массива
        a = new int[3];
        a[0] = -5;
        a[1] = 2;
        a[2] = 4;
        System.out.println(Arrays.toString(a));
        int b[];
        // копирование ссылки из а в b
        b = a;
        b[1] = 777;
        System.out.println(Arrays.toString(a));
    }
}
