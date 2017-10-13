package ru.itpark.best;


public class Terminal {
    private int sum;
    private Printer printer;

    public Terminal(int sum, Printer printer) {
        if (sum > 0) {
            this.sum = sum;
        } else this.sum = 0;
        this.printer = printer;
    }

    public int getMoney(int money) {
        if (money > 0) {
            this.sum -= money;
            printer.printCheck();
            return money;
        } else return 0;
    }
}
