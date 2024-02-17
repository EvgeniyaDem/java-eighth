package ru.netology.service;
public class SalesService {

    public int getSumSales(int[] sales) {
        int SumSales = 0;
        for (int month = 0; month < sales.length; month++) {
            SumSales = SumSales + sales[month];
        }
        return SumSales;
    }

    public int getAverageSales(int[] sales) {
        int SumSales = 0;
        int AverageSales = 0;
        for (int month = 0; month < sales.length; month++) {
            SumSales = SumSales + sales[month];
        }
        AverageSales = SumSales/sales.length;
        return AverageSales;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int getCountMonthSalesBelowAverage(int[] sales) {
        int cntMonthBelowAverage = 0;
        int SumSales = 0;
        int AverageSales = 0;
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

    public int getCountMonthSalesAboveAverage(int[] sales) {
        int cntMonthAboveAverage = 0;
        int SumSales = 0;
        int AverageSales = 0;
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