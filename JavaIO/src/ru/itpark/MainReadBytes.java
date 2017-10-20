package ru.itpark;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainReadBytes {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("input.txt");
            byte bytes[] = new byte[10];
            int countOfReadByte = inputStream.read(bytes);
            for (int i = 0; i < countOfReadByte; i++) {
                System.out.println((char)bytes[i]);
            }

        } catch (IOException e) {
            System.err.println("Ошибка");
        }
    }
}
