package ru.netology.stats;

public class StatsService {
    public long calcSum(long[] sales) { //сумма продаж за год
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcAverageSum(long[] sales) { //средняя сумма продаж в месяц
        return calcSum(sales) / 12;

    }

    public long calcFindMax(long[] sales) { // номер месяца с пиком продаж
        int findMax = 0;
        for (int i = 1; i < 12; i++) {
            if (sales[findMax] <= sales[i]) {
                findMax = i;
            }
        }
        findMax += 1;
        return findMax;
    }

    public long calcFindMin(long[] sales) { //последний месяц с минимумом продаж
        int findMin = 0;
        for (int i = 1; i < 12; i++) {
            if (sales[findMin] >= sales[i]) {
                findMin = i;
            }
        }
        findMin += 1;
        return findMin;
    }

    public long calcUnAverage(long[] sales) { //количество мес, где продажи были меньше средней
        int count = 0;
        long avg = calcAverageSum(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count = count + 1;
            }
        }
        return count;
    }

    public long calcUpAverage(long[] sales) { //количество мес, где продажи были больше средней
        int count = 0;
        long avg = calcAverageSum(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count = count + 1;
            }
        }
        return count;
    }
}

