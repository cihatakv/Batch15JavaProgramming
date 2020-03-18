package tasks;

import java.util.Arrays;

public class TaskOn12_10_2019_ShoppingWithArray_04 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

//        4 , *Below tasks will modify array :  (for each loop should not be used, try and see why)*
        System.out.println();

//        4.1 swap the value of first item in array with last item of array , swap `apple` with `kiwi`
        System.out.println("4.1 swap the value of first item in array with last item of array , swap `apple` with `kiwi`");

        String[] tempGroceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        ;

        String temp0 = groceryItems[0];
        String tempLast = groceryItems[groceryItems.length - 1];

        tempGroceryItems[0] = tempLast;
        tempGroceryItems[groceryItems.length - 1] = temp0;

        System.out.println("tempGroceryItems = " + Arrays.toString(tempGroceryItems));


//        4.2 use for loop to loop through your groceryItems array and modify your items like this :
//                    `itemValue+itemCharacterCount`
//        For example : `{"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}`
        System.out.println();
        System.out.println("4.2 use for loop to loop through your groceryItems array and modify your items like this :");
        String[] updatedGroceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        ;
        for (int i = 0; i < groceryItems.length; i++) {
            updatedGroceryItems[i] += updatedGroceryItems[i].length();
            System.out.println("updatedGroceryItems = " + updatedGroceryItems[i]);
        }

//        4.3 increase the value of each prices by one  in prices array
        System.out.println();
        System.out.println("4.3 increase the value of each prices by one  in prices array");
        System.out.println("prices = " + Arrays.toString(prices));
        float[] add1ToPrice = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        for (int i = 0; i < groceryItems.length; i++) {
            add1ToPrice[i] = add1ToPrice[i] + 1;
            System.out.println("add1ToPrice = " + add1ToPrice[i]);
        }
        System.out.println("add1ToPrice = " + Arrays.toString(add1ToPrice));
//        4.4 double the value of each prices in your array `1.99-->> 1.99*2`
        System.out.println();
        System.out.println("4.4 double the value of each prices in your array `1.99-->> 1.99*2`");
        float[] doublePrice = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        for (int i = 0; i < groceryItems.length; i++) {
            doublePrice[i] *= 2;
            System.out.println("doublePrice = " + doublePrice[i]);
        }
        System.out.println("add1ToPrice = " + Arrays.toString(doublePrice));
        System.out.println("===============================================");
        float[] doublePriceWithForEach = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        for (float priceWithForEach : doublePriceWithForEach) {
            priceWithForEach *= 2;
            System.out.println("doublePriceWithForEach = " + priceWithForEach);
        }

//        4.5 triple the value of each prices if it is less than 2 `1.99 -->> 1.99*3`
        System.out.println();
        System.out.println("4.5 triple the value of each prices if it is less than 2 `1.99 -->> 1.99*3`");
        float[] triplePrices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        float max = 0;
        for (float eachTriplePrices : triplePrices) {
            eachTriplePrices *= 3;
            if (eachTriplePrices > max)
                max = eachTriplePrices;
            System.out.println("eachTriplePrices = " + eachTriplePrices);
        }
         // System.out.println("Arrays.toString(eachTriplePrices) = " + Arrays.toString(eachTriplePrices));

//        4.6 now find out highest price after the modification
        System.out.println();
        System.out.println("4.6 now find out highest price after the modification");

        System.out.println("max = " + max);

//        4.7 find out the most expensive item name.
        System.out.println();
        System.out.println("4.7 find out the most expensive item name.");
        float maxPrice = 0;
        int j = 0;
        String maxPricesItem = "";
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxPricesItem = groceryItems[i];
                j = i;
            }
        }
        System.out.println("maxPricesItem = " + j + " : " + maxPricesItem);
    }
}






