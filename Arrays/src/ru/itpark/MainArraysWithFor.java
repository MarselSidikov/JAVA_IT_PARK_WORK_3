package ru.itpark;

public class MainArraysWithFor {
    public static void main(String[] args) {
        int array[] = {3, 5, 2, 3, 1, 6, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // развернуть массив без использования
        // допольнительного массива
        /*
            a[0] <-> a[6]
            a[1] <-> a[5]
            a[2] <-> a[4]
            Таким образом, всего 7 элементов,
            нужно сделать 3 шага.
            Обобщаем задачу - пусть n - размер
            Следовательно нужно сделать
            n / 2 итераций
            a[i] <-> a[n - 1 - i]

            int temp = a;
            a = b;
            b = temp;
         */


    }
}
