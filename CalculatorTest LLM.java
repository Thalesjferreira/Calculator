package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(7, calc.add(7, 0));
        assertEquals(7, calc.add(0, 7));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    public void testAddPositiveAndNegative() {
        assertEquals(1, calc.add(4, -3));
    }

    @Test
    public void testAddOverflow() {
        int result = calc.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testSubtractWithZero() {
        assertEquals(5, calc.subtract(5, 0));
        assertEquals(-5, calc.subtract(0, 5));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(1, calc.subtract(-2, -3));
    }

    @Test
    public void testSubtractOverflow() {
        int result = calc.subtract(Integer.MIN_VALUE, 1);
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calc.multiply(10, 0));
        assertEquals(0, calc.multiply(0, 10));
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        assertEquals(6, calc.multiply(-2, -3));
        assertEquals(-6, calc.multiply(-2, 3));
    }

    @Test
    public void testMultiplyOverflow() {
        int result = calc.multiply(Integer.MAX_VALUE, 2);
        assertEquals(-2, result);
    }

    @Test
    public void testDivideExactDivision() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideResultTruncation() {
        assertEquals(2, calc.divide(7, 3));
    }

    @Test
    public void testDivideNegativeNumbers() {
        assertEquals(-2, calc.divide(-6, 3));
        assertEquals(-2, calc.divide(6, -3));
        assertEquals(2, calc.divide(-6, -3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroThrowsException() {
        calc.divide(10, 0);
    }

    @Test
    public void testIsEvenZero() {
        assertTrue(calc.isEven(0));
    }

    @Test
    public void testIsEvenPositiveEven() {
        assertTrue(calc.isEven(4));
    }

    @Test
    public void testIsEvenPositiveOdd() {
        assertFalse(calc.isEven(3));
    }

    @Test
    public void testIsEvenNegativeEven() {
        assertTrue(calc.isEven(-4));
    }

    @Test
    public void testIsEvenNegativeOdd() {
        assertFalse(calc.isEven(-3));
    }
}
