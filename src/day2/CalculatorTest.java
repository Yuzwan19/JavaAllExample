package day2;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void hitung() {
        assertEquals(8.2, calculator.Operator(new InputanModel(10, 2, "-")), 0.2);
    }

    @Test
    public void operator() {
    }
}