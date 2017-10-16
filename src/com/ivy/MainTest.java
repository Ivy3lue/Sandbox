package com.ivy;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    @Test
    public void testCashReturnZero() throws Exception {
        assertArrayEquals(Main.cashReturn(0, 0), new int[]{-1, -1, -1, -1, -1});
    }

    @Test
    public void testCashReturnJustDollars() throws Exception {
        assertArrayEquals(Main.cashReturn(5, 1), new int[]{4, 0, 0, 0, 0});
    }

    @Test
    public void testCashReturnInsufficientFunds() throws Exception {
        assertArrayEquals(Main.cashReturn(3, 5), new int[]{-1, -1, -1, -1, -1});
    }

    @Test
    public void testCashReturnInvalidPrice() throws Exception {
        assertArrayEquals(Main.cashReturn(4.55, 0.05), new int[]{-1, -1, -1, -1, -1});
    }

    @Test
    public void testCashReturnNegativePrice() throws Exception {
        assertArrayEquals(Main.cashReturn(1, -5), new int[]{-1, -1, -1, -1, -1});
    }

    @Test
    public void testCashReturnAllCoins() throws Exception {
        assertArrayEquals(Main.cashReturn(10, 7.58), new int[]{2, 1, 1, 1, 2});
    }

    @Test
    public void testCashReturnNoCoins() throws Exception {
        assertArrayEquals(Main.cashReturn(16.21, 16.21), new int[]{0, 0, 0, 0, 0});
    }
}