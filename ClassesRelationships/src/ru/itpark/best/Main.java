package ru.itpark.best;

public class Main {

    public static void main(String[] args) {
        Printer blackPrinter = new PrinterStandardImpl();
        Printer redPrinter = new PrinterRedImpl();

        Terminal terminal = new Terminal(10, redPrinter);
        terminal.getMoney(10);
    }
}
