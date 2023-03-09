package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test

    public void testAverage() {
        StatsService service = new StatsService();
        long[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageMonthlySales(average);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void testMinimum() {
        StatsService service = new StatsService();
        long[] minimum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(minimum);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void testMaximum() {
        StatsService service = new StatsService();
        long[] maximum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(maximum);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void testBelowAverage() {
        StatsService service = new StatsService();
        long[] BelowAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.dayBelowAverage(BelowAverage);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        long[] AboveAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.dayAboveAverage(AboveAverage);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
        System.out.println(actual);
    }
}