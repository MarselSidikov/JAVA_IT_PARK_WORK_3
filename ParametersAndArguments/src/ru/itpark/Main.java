package ru.itpark;

public class Main {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapInArray(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        swap(x, y);
        System.out.println(x + " " + y);
        int z[] = {4, 7};
        swapInArray(z, 0, 1);
        System.out.println(z[0] + " " + z[1]);
    }
}
