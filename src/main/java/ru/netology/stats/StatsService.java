package ru.netology.stats;

public class StatsService { // Сумма всех продаж
    public long amountSales(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales = allSales + sale;

        }
        return allSales;
    }

    public long averageAmountSales(long[] sales) {  // Средняя сумма продаж в месяц
        long result = amountSales(sales) / 12;
        return result;
    }

    public int minSales(long[] sales) {  // Номер месяца, в котором был минимум продаж
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

    public int maxSales(long[] sales) {  // Номер месяца, в котором был максимум продаж
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

    public int MonthBelowAverageSales(long[] sales) {  // Количество месяцев, в которых продажи были ниже среднего
        int count = 0;
        for (long sale : sales) {
            if (sale < averageAmountSales(sales)) {
                count++;
            }
        }
        return count;
    }

    public int MonthOverAverageSales(long[] sales) {  // Количество месяцев, в которых продажи были выше среднего
        int count = 0;
        for (long sale : sales) {
            if (sale > averageAmountSales(sales)) {
                count++;
            }
        }
        return count;
    }
}






