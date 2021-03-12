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
    public void add() {
        int a = 2;
        int b = 3;

        Calculatrice calc = new Calculatrice();
        int actual = calc.add(a, b);

        assertEquals(6, actual);
    }

    @org.junit.Test
    public void sub() {
        int a = 4;
        int b = 2;

        Calculatrice calc = new Calculatrice();
        int actual = calc.sub(a, b);

        assertEquals(2, actual);
    }
}