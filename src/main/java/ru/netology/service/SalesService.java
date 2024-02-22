package ru.netology.service;
public class SalesService {

    public long getSumSales(long[] sales) {
        long SumSales = 0;
        for (int month = 0; month < sales.length; month++) {
            SumSales = SumSales + sales[month];
        }
        return SumSales;
    }

    public long getAverageSales(long[] sales) {
        long AverageSales = 0;
        AverageSales = getSumSales(sales)/sales.length;
        return AverageSales;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int getCountMonthSalesBelowAverage(long[] sales) {
        int cntMonthBelowAverage = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < getAverageSales(sales)) {
                cntMonthBelowAverage = cntMonthBelowAverage + 1;
            }
        }
        return cntMonthBelowAverage;
    }

    public int getCountMonthSalesAboveAverage(long[] sales) {
        int cntMonthAboveAverage = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > getAverageSales(sales)) {
                cntMonthAboveAverage = cntMonthAboveAverage + 1;
            }
        }
        return cntMonthAboveAverage;
    }

}