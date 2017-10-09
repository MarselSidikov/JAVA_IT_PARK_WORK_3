package ru.itpark;

public class RationalNumber {
    // поле, числитель
    private int numerator;
    // поле, знаменатель
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }

        optimize();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

//    public void multiply(RationalNumber that) {
//        this.numerator = this.numerator * that.numerator;
//        this.denominator = this.denominator * that.denominator;
//        optimize();
//    }

//    public RationalNumber multiply(RationalNumber that) {
//        RationalNumber result = new RationalNumber(
//                this.numerator * that.numerator,
//                this.denominator * that.denominator);
//        return result;
//    }

    public static RationalNumber multiply(RationalNumber a, RationalNumber b) {
        RationalNumber result = new RationalNumber(
                a.numerator * b.numerator,
                a.denominator * b.denominator);
        return result;
    }

    private void optimize() {
        int nod = calcNod(numerator, denominator);
        this.numerator = this.numerator / nod;
        this.denominator = this.denominator / nod;
    }

    private int calcNod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        int nod = 0;
        if (a > b) {
            nod = a;
        } else {
            nod = b;
        }

        return nod;
    }

}
