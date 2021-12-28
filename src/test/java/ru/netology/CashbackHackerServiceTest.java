package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldReturn100IfAmount900() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 900;

        int actual = cashbackHackerService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn900IfAmount1100() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1100;

        int actual = cashbackHackerService.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;

        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}