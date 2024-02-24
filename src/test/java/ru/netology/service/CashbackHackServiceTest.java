package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void Calc() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(1800);
        int expected = 200;

        assertEquals(expected, actual);
    }
}
