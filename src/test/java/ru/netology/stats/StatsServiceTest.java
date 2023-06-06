package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;
import java.lang.reflect.Array;
import java.util.Arrays;


public class StatsServiceTest {

    @Test
    void shouldCalculateSumAllSale() {
        StatsService service = new StatsService();

        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.sumAllSale(month);
                Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvgSumSaleMonth() {
        StatsService service = new StatsService();

        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.avgSumSaleMonth(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSaleMonth() {
        StatsService service = new StatsService();

        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.maxSaleMonth(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSaleMonth() {
        StatsService service = new StatsService();

        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.minSaleMonth(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvgLowerSaleMonth() {
        StatsService service = new StatsService();

        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.avgLowerSaleMonth(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvgBiggerSaleMonth() {
        StatsService service = new StatsService();

        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.avgBiggerSaleMonth(month);
        Assertions.assertEquals(expected, actual);
    }
}
