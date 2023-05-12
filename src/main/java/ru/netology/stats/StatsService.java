package ru.netology.stats;
public class StatsService {
    public long totalsales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public int averagesales(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        long totalSales = totalsales(sales);
        return (int) (totalSales / sales.length);
    }

    public int maxsalesmonth(long[] sales) {
        if (sales.length == 0) {
            return -1;
        }
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int minsalesmonth(long[] sales) {
        if (sales.length == 0) {
            return -1;
        }
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int monthsbelowaverage(long[] sales) {
        int average = averagesales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsaboveaverage(long[] sales) {
        int average = averagesales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
