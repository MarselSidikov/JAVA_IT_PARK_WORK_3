package ru.itpark.best;

public class PrinterRedImpl implements Printer {
    @Override
    public void printCheck() {
        System.err.println("You get money");
    }
}
