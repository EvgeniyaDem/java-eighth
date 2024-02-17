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
        long SumSales = 0;
        long AverageSales = 0;
        for (int month = 0; month < sales.length; month++) {
            SumSales = SumSales + sales[month];
        }
        AverageSales = SumSales/sales.length;
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
        long SumSales = 0;
        long AverageSales = 0;
        for (int month = 0; month < sales.length; month++) {
            SumSales = SumSales + sales[month];
        }
        AverageSales = SumSales/sales.length;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < AverageSales) {
                cntMonthBelowAverage = cntMonthBelowAverage + 1;
            }
        }
        return cntMonthBelowAverage;
    }

    public int getCountMonthSalesAboveAverage(long[] sales) {
        int cntMonthAboveAverage = 0;
        long SumSales = 0;
        long AverageSales = 0;
        for (int month = 0; month < sales.length; month++) {
            SumSales = SumSales + sales[month];
        }
        AverageSales = SumSales/sales.length;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > AverageSales) {
                cntMonthAboveAverage = cntMonthAboveAverage + 1;
            }
        }
        return cntMonthAboveAverage;
    }

}