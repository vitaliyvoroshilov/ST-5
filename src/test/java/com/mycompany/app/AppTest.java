package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    double delta = 0.00000001;

    @Test
    public void sqrt() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(12.34, sqrt.arg, delta);
    }

    @Test
    public void average1() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(sqrt.average(-10.0, -5.0), -7.5);
    }
    @Test
    public void average2() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(sqrt.average(-10.0, 10.0), 0.0);
    }
    @Test
    public void average3() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(sqrt.average(5.0, 10.0), 7.5);
    }

    @Test
    public void good1() {
        Sqrt sqrt = new Sqrt(12.34);
        assertTrue(sqrt.good(2.0, 4.0));
    }
    @Test
    public void good2() {
        Sqrt sqrt = new Sqrt(12.34);
        assertFalse(sqrt.good(2.0, 5.0));
    }
    @Test
    public void good3() {
        Sqrt sqrt = new Sqrt(12.34);
        assertTrue(sqrt.good(2.0, 4.000000009));
    }
    @Test
    public void good4() {
        Sqrt sqrt = new Sqrt(12.34);
        assertFalse(sqrt.good(2.0, 4.000000011));
    }

    @Test
    public void improve1() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(sqrt.improve(1.0, 2.0), 1.5);
    }
    @Test
    public void improve2() {
        Sqrt sqrt = new Sqrt(12.34);
        double x = 4.0;
        double guess1 = 1.0;
        double guess2 = sqrt.improve(guess1, x);
        assertTrue(Math.abs(guess1 * guess1 - x) > Math.abs(guess2 * guess2 - x));
    }

    @Test
    public void iter() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(sqrt.iter(1.0, 4.0), 2.0, delta);
    }

    @Test
    public void calc1() {
        Sqrt sqrt = new Sqrt(12.34);
        assertEquals(sqrt.calc(), Math.sqrt(12.34), delta);
    }
    @Test
    public void calc2() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(sqrt.calc(), 1.0, delta);
    }
}
