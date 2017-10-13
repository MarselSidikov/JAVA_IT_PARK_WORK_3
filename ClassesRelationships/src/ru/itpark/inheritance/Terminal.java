package ru.itpark.inheritance;

public class Terminal extends Printer {
    private int sum;

    public Terminal(int sum) {
        if (sum > 0) {
            this.sum = sum;
        } else this.sum = 0;
    }

    public int getMoney(int money) {
        if (money > 0) {
            this.sum -= money;
            printCheck();
            return money;
        } else return 0;
    }
}
