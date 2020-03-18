package tasks;

import java.util.Arrays;

public class TaskOn12_10_2019_ShoppingWithArray_02 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

//        2, loop through each prices  and print them in one line
        for (float eachPrice : prices) {
            System.out.print(eachPrice + " ");
        }

        System.out.println();
//        2.1 print each prices in even index
        for (int i = 0; i < prices.length; i++) {
            if (i % 2 == 0)
                System.out.println(i + ". index is " + prices[i]);
        }
        System.out.println();
//        2.2 print only prices less that 3 dollars
        for (float eachPrice : prices) {
            if (eachPrice < 3)
                System.out.println(eachPrice);
        }
        System.out.println();
//        2.3 print the sum of all the prices and get average
        System.out.println("2.3 print the sum of all the prices and get average");
        float totalPrices = 0;
        for (float eachPrice : prices) {
            totalPrices += eachPrice;
        }
        System.out.println("totalPrices = " + totalPrices);
        float average = totalPrices / prices.length;
        System.out.println("averagePrices = " + average);

        System.out.println();
//        2.4 print only prices more than average price
        System.out.println("2.4 print only prices more than average price");
        for (float eachPrice : prices) {
            if (eachPrice > average)
                System.out.println("eachPrice = " + eachPrice);
        }
        System.out.println();
//        2.5 print the sum of all the prices and get average
        System.out.println("2.5 print the sum of all the prices and get average");
        totalPrices = 0;
        for (float eachPrice : prices) {
            totalPrices += eachPrice;
        }
        System.out.println("totalPrices = " + totalPrices);
        average = totalPrices / prices.length;
        System.out.println("averagePrices = " + average);
        System.out.println();
//        2.6 print only prices more than average price
        System.out.println("2.6 print only prices more than average price");
        for (float eachPrice : prices) {
            if (eachPrice > average)
                System.out.println("eachPrice = " + eachPrice);
        }
        System.out.println();
//        2.7 find out max price and print out max price and index of max price
        System.out.println("2.7 find out max price and print out max price and index of max price");
        float max = 0;
        int maxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxIndex = i;
            }
        }
        System.out.println("maxIndex = " + maxIndex);
        System.out.println("max = " + max);
        System.out.println();
//        2.8 find out the minimum price and index of minimum price
        System.out.println("2.8 find out the minimum price and index of minimum price");
        float min = prices[0];
        int jIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                jIndex = i;
            }
        }
        System.out.println("Min index is = " + jIndex);
        System.out.println("min = " + min);
//        2.9 find out second max price and index
        System.out.println();
        System.out.println("2.9 find out second max price and index");
        max = 0;
        maxIndex = 0;
        float[] newPrices = new float[prices.length];
        for (int i = 0; i < prices.length; i++) {
            newPrices[i] = prices[i];
        }
        Arrays.sort(newPrices);
        float secondMax = 0;
        int secondMaxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == newPrices[newPrices.length - 2]) {
                secondMax = prices[i];
                secondMaxIndex = i;
            }
        }
        System.out.println("secondMaxIndex = " + secondMaxIndex);
        System.out.println("secondMax = " + secondMax);
    }
}