package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void Calc() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(1800);
        int expected = 200;

        assertEquals(actual, expected);
    }
}