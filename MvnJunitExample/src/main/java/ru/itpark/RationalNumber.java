package ru.itpark;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class RationalNumber {
  private int numerator;
  private int denominator;

  RationalNumber(int numerator, int denominator) {
    this.numerator = numerator;

    if (denominator != 0) {
      this.denominator = denominator;
    } else throw new ArithmeticException("Divide by zero");

  }

  public static RationalNumber create(int numerator, int denominator) {
    return new RationalNumber(numerator, denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public void optimize() {
    int gcd = calcGcd(numerator, denominator);

    this.numerator = this.numerator / gcd;
    this.denominator = this.denominator / gcd;
  }

  private int calcGcd(int a, int b) {
    while (a != 0 && b != 0) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }

    return Math.max(a, b);
  }

  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("Numerator", this.numerator)
        .add("Denominator", this.denominator)
        .toString();
  }

  public boolean equals(Object obj) {
    if (obj == null ||
        !obj.getClass().getName().equals(this.getClass().getName())) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    else {
      RationalNumber that = (RationalNumber)obj;
      return Objects.equal(this.numerator, that.numerator) &&
          Objects.equal(this.denominator, that.denominator);
    }
  }

  public int hashCode() {
    return Objects.hashCode(this.numerator, this.denominator);
  }
}
