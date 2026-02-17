package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculator_ESTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        try {
            calc.divide(10, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }

    @Test
    public void testIsEvenZeroBranch() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(0));
    }

    @Test
    public void testIsEvenFalseBranch() {
        Calculator calc = new Calculator();
        assertFalse(calc.isEven(3));
    }

    @Test
    public void testIsEvenTrueBranch() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(4));
    }
}
