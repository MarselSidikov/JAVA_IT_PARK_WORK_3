package ru.itpark;

public class Main {

    public static void main(String[] args) {
        RationalNumber x =
                new RationalNumber(6, 7);
        RationalNumber y =
                new RationalNumber(2, 3);
        // 6/7 * 2/3 = 12/21 ~ 4/7
        // x.multiply(y);

        // RationalNumber c = x.multiply(y);

        RationalNumber c = RationalNumber.multiply(x, y);
        System.out.println(x.getNumerator() +
                "/" + x.getDenominator());

        System.out.println(c.getNumerator() +
                "/" + c.getDenominator());
    }
}
