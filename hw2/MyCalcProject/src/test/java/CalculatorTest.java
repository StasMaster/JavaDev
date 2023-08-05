import goit.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd(){
        // Given
        Calculator calc = new Calculator();

        // When
        final int a = 2;
        final int b = 3;
        final int result = calc.add(a, b);

        // Then
        final int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void testSub(){
        // Given
        Calculator calc = new Calculator();

        // When
        final int a = 5;
        final int b = 3;
        final int result = calc.sub(a, b);

        // Then
        final int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void testMul(){
        // Given
        Calculator calc = new Calculator();

        // When
        final int a = 2;
        final int b = 3;
        final int result = calc.mul(a, b);

        // Then
        final int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void testDiv(){
        // Given
        Calculator calc = new Calculator();

        // When
        final int a = 6;
        final int b = 3;
        final int result = calc.div(a, b);

        // Then
        final int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void testDivByZero(){
        // Given
        Calculator calc = new Calculator();

        // When
        final int a = 6;
        final int b = 0;

        // Then
        assertThrows(ArithmeticException.class, () -> calc.div(a, b));
    }
}