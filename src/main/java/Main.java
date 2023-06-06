import ru.netology.stats.StatsService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        System.out.println(service.sumAllSale(month));
        System.out.println(service.avgSumSaleMonth(month));
        System.out.println(service.maxSaleMonth(month));
        System.out.println(service.minSaleMonth(month));
        System.out.println(service.avgLowerSaleMonth(month));
        System.out.println(service.avgBiggerSaleMonth(month));
    }
}
