package ru.netology.stats;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StatsServiceTest {

    @Test
    public void totalsales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService Service = new StatsService();
        int expected = 180;
        long actual = Service.totalsales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void averagesales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService Service = new StatsService();
        double expected = 15.0;
        double actual = Service.averagesales(sales);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void maxsalesmonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService Service = new StatsService();
        int expected = 5;
        int actual = Service.maxsalesmonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void minsalesmonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService Service = new StatsService();
        int expected = 8;
        int actual = Service.minsalesmonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void belowaveragesales() {
        long[] sales = {8, 15, 13, 15, 7, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 4;
        int actual = service.monthsbelowaverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void aboveaveragesales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService Service = new StatsService();
        int expected = 5;
        int actual = Service.monthsaboveaverage(sales);
        assertEquals(expected, actual);
    }
}
