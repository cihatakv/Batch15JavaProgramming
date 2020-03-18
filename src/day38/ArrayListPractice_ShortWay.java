package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {
    public static void main(String[] args) {


        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);

        // prices.remove(0);

        int count = 0;

        for (Double each : prices) {
            if (each > 5) {
                count++;
            }
        }
        System.out.println("count = " + count);

        // I want to add two more prices (does not have to be the same list)

        ArrayList<Double> newPrices = new ArrayList<>(prices);

        newPrices.add(199.99);
        // newPrices.remove(0.99);
        newPrices.add(0.99);
        // System.out.println("newPrices = " + newPrices);


    }
}
