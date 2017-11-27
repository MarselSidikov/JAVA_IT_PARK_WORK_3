package ru.itpark;

import java.util.Random;
import java.util.Scanner;

public class Main {
  static int array[];
  static int result;

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int numbersCount = scanner.nextInt();

    Random random = new Random();
    array = new int[numbersCount];

    int sum = 0;
    for (int i = 0; i < numbersCount; i++) {
      array[i] = random.nextInt(1001);
    }

    for (int i = 0; i < numbersCount; i++) {
      sum += array[i];
    }

    System.out.println(sum);

    int blockCount = scanner.nextInt();

    Worker workers[] = new Worker[blockCount];

    int blockSize = numbersCount / blockCount;

    int start = 0;
    int end = blockSize;

    for (int i = 0; i < blockCount - 1; i++) {
      workers[i] = new Worker(array, start, end);
      start += blockSize;
      end += blockSize;
    }
    end = numbersCount;
    workers[blockCount - 1] = new Worker(array, start, end);

    for (int i = 0; i < blockCount; i++) {
      workers[i].start();
    }

    for (int i = 0; i < blockCount; i++) {
      workers[i].join();
    }

    System.out.println(result);
  }
}
