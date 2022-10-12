package ru.netology.statictiks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatictiksServiceTest {
    @Test
    void findMax() {
        StatictiksService service = new StatictiksService();

        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 1};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativ() {
        StatictiksService service = new StatictiksService();

        long[] incomesInBillions = {-1, -2, -3, -7, -5, -12, -9, -11, -11, -13};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findZero(){
        StatictiksService service = new StatictiksService();
        long[] incomesInBillion = {-1, 0, -2, -5, -7, 0, -12, -11, -3};
        long expected = 0;
        long actual = service.findMax(incomesInBillion);

        assertEquals(expected, actual);
    }
}
