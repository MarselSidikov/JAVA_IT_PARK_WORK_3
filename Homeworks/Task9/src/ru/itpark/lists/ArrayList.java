package ru.itpark.lists;

public class ArrayList implements List {
    private static final int MAX_SIZE = 10;
    private int elements[];
    private int count;

    public ArrayList() {
        this.elements = new int[MAX_SIZE];
        this.count = 0;
    }

    @Override
    public void add(int element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Нет места");
        }
    }

    @Override
    public void addToBegin(int element) {
        // TODO: реализовать самостоятельно
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        private int current;

        public ArrayListIterator() {
            current = 0;
        }

        @Override
        public int next() {
            int element = elements[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}
