package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class SalesServiceTest {

    @Test
    public void shouldFindSumSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 180;
        long actualSumSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldFindAverageSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSales = 15;
        long actualAverage = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverage);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinMonthSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCountMonthSalesBelowAverage() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCntMonthBelowAverage = 5;
        int actualCntMonthBelowAverage = service.getCountMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedCntMonthBelowAverage, actualCntMonthBelowAverage);
    }


    @Test
    public void shouldCountMonthSalesAboveAverage() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCntMonthAboveAverage = 5;
        int actualCntMonthAboveAverage = service.getCountMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expectedCntMonthAboveAverage, actualCntMonthAboveAverage);
    }
}