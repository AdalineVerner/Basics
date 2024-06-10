package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test

    public void shouldCountRemainderIfAmountHigherBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 10777;

        int expected = 223;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test

    public void shouldCountRemainderIfAmountLowerBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 495;

        int expected = 505;
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test

    public void shouldCountRemainderIfAmountEqualBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}