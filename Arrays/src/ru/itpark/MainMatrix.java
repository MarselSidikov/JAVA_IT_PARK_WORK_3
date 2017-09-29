package ru.itpark;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];
        int number = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = number;
                number++;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int notMatrix[][] = new int[3][];
        notMatrix[0] = new int[2];
        notMatrix[1] = new int[5];
        notMatrix[2] = new int[1];

        for (int i = 0; i < notMatrix.length; i++) {
            for (int j = 0; j < notMatrix[i].length; j++) {
                System.out.print(notMatrix[i][j] + " ");
            }
            System.out.println();
        }
        // int cube[][][] = new int[2][4][5];
    }
}
