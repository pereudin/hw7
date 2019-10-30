package ru.pereudin.hw7.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AdditionNumbersTest {

    private AdditionNumbers additionNumbers;

    @Before
    public void before() {
        additionNumbers = new AdditionNumbers();
    }

    @Test
    public void additionTwoNumbers_whenSome_isCorrect() {
        int num1 = 10;
        int num2 = 58;
        int sum = additionNumbers.additionTwoNumbers(num1, num2);
        Assert.assertEquals(sum, 68);
    }

    @Test
    public void additionTwoNumbers_whenSome_isIncorrect() {
        int num1 = 10;
        int num2 = 58;
        int sum = additionNumbers.additionTwoNumbers(num1, num2);
        Assert.assertNotEquals(sum, 70);
    }

}
