package com.epsi.calculatrice;

import static org.junit.Assert.*;

public class CalculatriceTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testAdd() {
        int a = 2;
        int b = 4;

        Calculatrice calc = new Calculatrice();
        int actual = calc.add(a, b);

        assertEquals(6, actual);
    }

    @org.junit.Test
    public void testSub() {
        int a = 4;
        int b = 2;

        Calculatrice calc = new Calculatrice();
        int actual = calc.sub(a, b);

        assertEquals(2, actual);
    }

    @org.junit.Test
    public void testMul() {
        int a = 4;
        int b = 2;

        Calculatrice calc = new Calculatrice();
        int actual = calc.mul(a, b);

        assertEquals(8, actual);
    }

    @org.junit.Test
    public void testDiv() {
        int a = 4;
        int b = 2;

        Calculatrice calc = new Calculatrice();
        int actual = calc.div(a, b);

        assertEquals(2, actual);
    }

    @org.junit.Test
    public void testPair() {
        int a = 4;

        Calculatrice calc = new Calculatrice();
        int actual = calc.isPair(a);

        assertEquals(0, actual);
    }

    @org.junit.Test
    public void testPremier() {
        int a = 11;

        Calculatrice calc = new Calculatrice();
        boolean actual = calc.isPremier(a);

        assertEquals(true, actual);
    }
}