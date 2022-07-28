package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldcalcSum() {
        StatsService service = new StatsService(); // сумма продаж за год
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcSum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void calcAverageSum() {
        StatsService service = new StatsService(); //средняя сумма продаж в месяц
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcAverageSum(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() {
        StatsService service = new StatsService(); //номер месяца с пиком продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcFindMax(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMin() {
        StatsService service = new StatsService(); //последний месяц с минимумом продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcFindMin(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void calcUnAverage() {
        StatsService service = new StatsService(); //количество месяцев, где продажи были меньше средней
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcUnAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void calcUpAverage() {
        StatsService service = new StatsService(); //количество месяцев, где продажи были больше средней
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcUpAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
