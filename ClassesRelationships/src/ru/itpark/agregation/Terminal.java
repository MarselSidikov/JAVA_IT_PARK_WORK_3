package ru.itpark.agregation;


public class Terminal {
    private int sum;
    private Printer printer;

    public Terminal(int sum) {
        if (sum > 0) {
            this.sum = sum;
        } else this.sum = 0;
        printer = new Printer();
    }

    public int getMoney(int money) {
        if (money > 0) {
            this.sum -= money;
            printer.printCheck();
            return money;
        } else return 0;
    }
}
