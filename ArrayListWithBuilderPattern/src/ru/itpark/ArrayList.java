package ru.itpark;

public class ArrayList {
    private static final int MAX_SIZE = 10;
    private int elements[];
    private int count;

    public ArrayList() {
        this.elements = new int[MAX_SIZE];
        this.count = 0;
    }

    public ArrayList add(int element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
        return this;
    }
}
