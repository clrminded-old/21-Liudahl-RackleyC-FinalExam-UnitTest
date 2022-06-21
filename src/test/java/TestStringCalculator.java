package src.test.java;

import java.lang.IllegalArgumentException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import src.main.java.StringCalculator;

public class TestStringCalculator {
    private static StringCalculator sc = new StringCalculator();

    @Test
    public void StringCalculatorTest() {
        boolean actual = sc.add("5,5") == 10;
        assertTrue(actual);

    }

    @Test
    public void StringCalculatorTest2() {
        int actual = sc.add("-1,5");
        assertEquals(new IllegalArgumentException(), actual);
    }

}
