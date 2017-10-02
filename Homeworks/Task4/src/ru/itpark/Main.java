package ru.itpark;
public class Main {
    public static int parse(char digits[]) {
        int sum = 0;
        int t = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = sum + (digits[i] - '0') * t;
            t *= 10; // t = t * 10
        }
        return sum;
    }

    public static void main (String args[]) {
        // 3241 = 3 * 1000 + 2 * 100 + 4 * 10 + 1 * 1
        char number[] = {'3', '2', '4', '1'};
        // short numberAsInt = parse(number);
        int numberAsInt = parse(number);

        System.out.println(numberAsInt);
    }
}