package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;

        for (long sale :
                sales) {
            totalSale += sale;

        }
        return totalSale;

    }

    public long AverageMonthlySales(long[] average) {
        return sum(average) / average.length;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int DayBelowAverage(long[] sales) {
        int dayNumberBelow = 0;
        for (long sale : sales) {
            if (sale < AverageMonthlySales(sales)) {
                dayNumberBelow++;
            }
        }

            return dayNumberBelow;
        }
    public int DayAboveAverage(long[] sales) {
        int dayNumberAbove = 0;
        for (long sale : sales) {
            if (sale > AverageMonthlySales(sales)) {
                dayNumberAbove++;
            }
        }

        return dayNumberAbove;
    }

    }