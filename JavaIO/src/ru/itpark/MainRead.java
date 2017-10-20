package ru.itpark;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainRead {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("input.txt");
            int currentByte;
            do {
                currentByte = inputStream.read();
                System.out.println((char)currentByte);
            } while (currentByte != -1);

        } catch (IOException e) {
            System.err.println("Ошибка");
        }
    }
}
