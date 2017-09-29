package ru.itpark;

import java.util.Arrays;

public class Main {

    public static int sum(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    public static void sortByInsertion(int array[]) {
        int minIndex;
        int min;
        // проходим по всему массиву
        for (int i = 0; i < array.length; i++) {
            // System.out.println(Arrays.toString(array));
            // цель - найти минимальный элемент
            // в диапазоне i .. length - 1
            // так как все элементы слева от a[i]
            // уже отсортированы
            // полагаем, что минимальный элемент
            // это первый элемент текущего диапазона
            min = array[i];
            minIndex = i;
            // для всех элементов i .. length -1
            for (int j = i; j < array.length; j++) {
                // если просматриваемый элемент оказался
                // меньше предполагаемого
                if (min > array[j]) {
                    // запоминаем его и его индекс
                    min = array[j];
                    minIndex = j;
                }
            }
            // когда цикл прошел, у нас есть
            // минимальный элемент
            // и его индекс - делаем замену
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int x[] = {2, 1, -4, 6, 1, 2, 5};
        System.out.println("Array before sort: " + Arrays.toString(x));
        // x - аргумент
        sortByInsertion(x);
        System.out.println("Array after sort: " + Arrays.toString(x));
        int sumOfArrayElements = sum(x);
        System.out.println(sumOfArrayElements);
    }
}
