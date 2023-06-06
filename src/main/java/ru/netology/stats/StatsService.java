package ru.netology.stats;
public class StatsService {
    public int sumAllSale(int[] month) {
        int sumSale = 0;
        for (int i = 0; i < month.length; i++) {
            sumSale = sumSale + month[i];
        }
        return sumSale;
    }
    public int avgSumSaleMonth(int[] month) {
        int sumSale = sumAllSale(month);
        int avgSum = sumSale / 12;
        return avgSum;
    }
    public int maxSaleMonth(int[] month) {
        int maxSale = month[0];
        int count = 0;
        for (int i = 0; i < month.length; i++) {
            if (maxSale <= month[i]) {
                maxSale = month[i];
                count = i;
            }
        }
        return count + 1;
    }
    public int minSaleMonth(int[] month) {
        int minSale = month[0];
        int count = 0;
        for (int i = 0; i < month.length; i++) {
            if (minSale >= month[i]) {
                minSale = month[i];
                count = i;
            }
        }
        return count + 1;
    }
    public int avgLowerSaleMonth(int[] month) {
        int avgSum = avgSumSaleMonth(month);
        int count = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] < avgSum) {
                count++;
            }
        }
        return count;
    }
    public int avgBiggerSaleMonth(int[] month) {
        int avgSum = avgSumSaleMonth(month);
        int count = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > avgSum) {
                count++;
            }
        }
        return count;
    }
}
