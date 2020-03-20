package MyMentoring.collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {

        // Lets assume you are searching for iphone on amazon
        // many search results came in
        // i want you to store all the price element on the result page
        // in the meantime ,I want you to store all the price text into a List
        // we can use findElements and getText together
        // it will give us a List<String> that contains prices
        // but we want to get List<Double>
//        String price = "100.99" ;
//        double priceNum = Double.parseDouble(price);
//        System.out.println("priceNum = " + priceNum);
        List<String> priceLstStr = new ArrayList<>(Arrays.asList("99.99", "149.99", "79.99", "149.99", "299.99", "599.99", "299.99", "599.99"));
        priceLstStr.add("999.99");
        System.out.println("priceLstStr = " + priceLstStr);
        // but we want to get List<Double>
        List<Double> prices = new ArrayList<>();
        for (String eachPriceStr : priceLstStr) {
            prices.add(Double.parseDouble(eachPriceStr));
        }
        System.out.println("prices in double = " + prices);
        // how do I get max price , min , average

        double min = prices.get(0);
        double max = prices.get(0);
        double sum = 0;
        for (Double eachPrice : prices) {
            sum += eachPrice;
            if (eachPrice < min)
                min = eachPrice;
            if (eachPrice > max)
                max = eachPrice;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        double average = sum / prices.size();
        System.out.println("average = " + average);

        //  get the unique prices
        Set<Double> unique = new HashSet<>(prices);
        System.out.println("unique = " + unique);


        //  remove items above average

        for (int i = prices.size() - 1; i >= 0; i--) {
            if (prices.get(i) > average)
                prices.remove(prices.get(i));
        }

        System.out.println("After Removal prices = " + prices);

    }
}
