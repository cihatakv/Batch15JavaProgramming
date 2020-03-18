package tasks;

public class TaskOn12_10_2019_ShoppingWithArray_03 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        // 3, assume that the order of grocery Items match the prices in same order do below:
        // 3.1 print first item and first price in one print statement -->>  apple price is 1.99
        System.out.println("3.1 print first item and first price in one print statement -->>  apple price is 1.99");

        System.out.println(groceryItems[0] + " price is " + prices[0]);

        System.out.println();

        // 3.2 print last item and last price in one print statement-->>  kiwi price is 2.88

        System.out.println("3.2 print last item and last price in one print statement-->>  kiwi price is 2.88");

        System.out.println();

        // 3.2 print all items and prices in one for loop together

        System.out.println("3.2 print all items and prices in one for loop together");

        System.out.println(groceryItems[groceryItems.length - 1] + " price is " + prices[prices.length - 1]);

        // 3.3 print only those items with price more than 3.11

        System.out.println();

        System.out.println("3.3 print only those items with price more than 3.11");

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > 3.11)
                System.out.println(groceryItems[i] + " price is " + prices[i]);
        }

        // 3.4 print only those items with price more than average

        System.out.println();

        System.out.println("3.4 print only those items with price more than average");

        float totalPrices = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            totalPrices += prices[i];
        }
        float average = totalPrices / (float) prices.length;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > average)
                System.out.println(groceryItems[i] + "'s price is " + prices[i] + " and more than average which is " + average);
        }

        // 3.5 print only those prices of grocery items that contains letter b

        System.out.println();

        System.out.println("3.5 print only those prices of grocery items that contains letter b");

        for (int i = 0; i < prices.length; i++) {
            if (groceryItems[i].contains("b"))
                System.out.println(groceryItems[i] + " contains \'b\' and its price is " + prices[i]);
        }

        // 3.6 print the item name with max price
        System.out.println();
        System.out.println("3.6 print the item name with max price");

        float max = 0;
        int maxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxIndex = i;
                //break;
            }
        }
        System.out.println(groceryItems[maxIndex] + " is the most expensive one in the list and it is " + max);

        // 3.7 print the item name with min price

        System.out.println();

        System.out.println("3.7 print the item name with min price");

        float min = prices[0];
        int minIndex = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        System.out.println(groceryItems[minIndex] + "'s price is the smallest one and it is " + min);
    }
}
