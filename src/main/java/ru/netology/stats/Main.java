package ru.netology.stats;
public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println("Сумма всех продаж: " + service.totalsales(sales));
        System.out.println("Средняя сумма всех продаж: " + service.averagesales(sales));
        System.out.println("Месяц продаж на макс. сумму: " + service.maxsalesmonth(sales));
        System.out.println("Месяц продаж на мин. сумму: " + service.minsalesmonth(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего : " + service.monthsbelowaverage(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего : " + service.monthsaboveaverage(sales));
    }
}
