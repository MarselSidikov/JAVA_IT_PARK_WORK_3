package ru.itpark;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x[];
	    int n = scanner.nextInt();
	    x = new int[n];
	    for (int i = 0; i < x.length; i++) {
	        x[i] = scanner.nextInt();
        }
        reverse(x);
        System.out.println(Arrays.toString(x));

    }
}
