package ru.itpark;

public class MainMinMaxSwap {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 5, 6, 7, 8, 100};
        // переменная для хранения минимума
        int min = array[0];
        // переменная для хранения индекса минимума
        int minPosition = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }
        }
        int max = array[0];
        int maxPosition = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxPosition = i;
            }
        }
        int temp = array[minPosition];
        array[minPosition] = array[maxPosition];
        array[maxPosition] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
