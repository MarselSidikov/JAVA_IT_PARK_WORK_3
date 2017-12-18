package ru.itpark.anon;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Matrix<Integer> integerMatrix = new Matrix<Integer>() {

      private Integer matrix[][];

      {
        matrix = new Integer[10][10];
      }
      @Override
      public void set(int i, int j, Integer value) {
        this.matrix[i][j] = value;
      }

      @Override
      public Integer get(int i, int j) {
        return this.matrix[i][j];
      }
    };

    integerMatrix.set(2, 3, 50);
    System.out.println(integerMatrix.get(2, 3));

    Matrix<Double> doubleMatrix = new Matrix<Double>() {

      class MatrixElement {
        int i;
        int j;
        Double value;

        MatrixElement(int i, int j, Double value) {
          this.i = i;
          this.j = j;
          this.value = value;
        }
      }

      List<MatrixElement> matrix;

      {
        matrix = new ArrayList<>();
      }

      @Override
      public void set(int i, int j, Double value) {
        for (int currentElement = 0; i < matrix.size(); i++) {
          if (matrix.get(currentElement).i == i &&
              matrix.get(currentElement).j == j) {
            MatrixElement element = matrix.get(currentElement);
            element.value = value;
            return;
          }
        }
        matrix.add(new MatrixElement(i, j, value));
      }

      @Override
      public Double get(int i, int j) {
        for (int currentElement = 0; currentElement < matrix.size(); currentElement++) {
          if (matrix.get(currentElement).i == i &&
              matrix.get(currentElement).j == j) {
            return matrix.get(currentElement).value;
          }
        }
        return null;
      }
    };

    doubleMatrix.set(3, 5, 3.14);
    doubleMatrix.set(1000, 5000, 2.718281828);
    System.out.println(doubleMatrix.get(3,5));
    System.out.println(doubleMatrix.get(1000,5000));
  }
}
