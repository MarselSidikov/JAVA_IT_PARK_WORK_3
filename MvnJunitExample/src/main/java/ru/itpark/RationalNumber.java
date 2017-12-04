package ru.itpark;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class RationalNumber {
  private int numerator;
  private int denominator;

  public RationalNumber(int numerator, int denominator) {
    this.numerator = numerator;

    if (denominator != 0) {
      this.denominator = denominator;
    } else throw new ArithmeticException("Divide by zero");
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
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
