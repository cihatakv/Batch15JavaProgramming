package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("\n\tpriceList = " + priceList);
        // change the third price to 10 $

        priceList.set(2, 10.0);
        System.out.println("third price = " + priceList.get(2));
        System.out.println("\n\tpriceList = " + priceList);

        // Add 4 dollar to first price
        priceList.set(0, priceList.get(0) + 4);
        System.out.println("first price = " + priceList.get(0));
        System.out.println("\n\tpriceList = " + priceList);

        // Change Last price to of first and second
        priceList.set(priceList.size() - 1, priceList.get(0) + priceList.get(1));
        System.out.println("Last price = " + priceList.get(priceList.size() - 1));
        System.out.println("\n\tpriceList = " + priceList);

        // give 40% off to second price
        priceList.set(1, priceList.get(1) * 0.6);
        System.out.println("second price = " + priceList.get(1));
        System.out.println("\n\tpriceList = " + priceList);

        // Double the value
        for (int i = 0; i < priceList.size(); i++)
            priceList.set(i, priceList.get(i) * 2);
        System.out.println("\n\tpriceList = " + priceList);

        // cut the price into half if the price is more than 20
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) > 20)
                priceList.set(i, priceList.get(i) / 2);
        }
        System.out.println("\n\tpriceList = " + priceList);


    }
}
