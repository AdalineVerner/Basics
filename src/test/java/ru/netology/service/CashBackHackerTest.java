package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackerTest {

    @Test

    public void shouldCountRemainderIfAmountHigherBoundary() {

        CashBackHacker service = new CashBackHacker();

        int amount = 7985;

        int expected = 15;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCountRemainderIfAmountLowerBoundary() {

        CashBackHacker service = new CashBackHacker();

        int amount = 690;

        int expected = 310;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void shouldCountRemainderIfAmountEqualBoundary() {
        CashBackHacker service = new CashBackHacker();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}



