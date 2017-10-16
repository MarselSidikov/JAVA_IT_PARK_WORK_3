package ru.itpark;

public class MainStackOverflowError {
    public static int fact(int n) {
        System.out.println("int fact with " + n);
//        if (n == 0) {
//            return 1;
//        }
        int result = fact(n - 1) * n;
        System.out.println("Calc " + result);
        return result;
    }

    public static void main(String[] args) {
        // n! = (n - 1)! * n = (n - 2)! * (n-1) * n
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        fact(6);
    }
}
