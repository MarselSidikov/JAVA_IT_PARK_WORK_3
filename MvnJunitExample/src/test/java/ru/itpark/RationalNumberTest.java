package ru.itpark;

import org.junit.Assert;
import org.junit.Test;

public class RationalNumberTest {

  @Test
  public void optimizeTest() throws Exception {
    RationalNumber actual = RationalNumber.create(15, 9);

    actual.optimize();

    RationalNumber expected = RationalNumber.create(5, 3);

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void createTest() throws Exception {
    RationalNumber actual = RationalNumber.create(15, 9);
    RationalNumber expected = new RationalNumber(15, 9);

    Assert.assertEquals(expected, actual);
  }

  @Test(expected = ArithmeticException.class)
  public void createTestOnBadData() throws Exception {
    RationalNumber.create(15, 0);
  }

}