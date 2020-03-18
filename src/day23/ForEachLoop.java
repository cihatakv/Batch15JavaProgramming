package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};
        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices = " + prices[i]);
        }
        System.out.println("---------------");
        double sum = 0;
        for (double eachPrice : prices) {
            System.out.println("eachPrice = " + eachPrice);
            sum += eachPrice;
        }
        System.out.println("sum = " + sum);



    }
}
