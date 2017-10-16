package ru.itpark.files;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        byte bytesFromFile[] = new byte[50];
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("input1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }

        try {
            inputStream.read(bytesFromFile);
        } catch (IOException e) {
            System.out.println("Что-то не так с вводом выводом");
        }
        String stringFromBytes = new String(bytesFromFile);
        System.out.println(stringFromBytes);
    }
}
