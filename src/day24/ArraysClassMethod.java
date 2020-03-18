package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {

        // Arrays class coming from java.util package
        // it has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString ---> Arrays.toString(yorArrayHere)
        // This method will give you string representation of any type of array
        // the result will look --> [item1, item2, ...., last item]

        String[] superHero = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};

        System.out.println(Arrays.toString(superHero));

        String superHerosAsString = Arrays.toString(superHero);
        System.out.println(superHerosAsString.charAt(0));
        System.out.println(superHerosAsString.substring(1, superHerosAsString.length() - 1));

        System.out.println("-------------");
        int[] numbers = {10, 44, 55, 3, 78};
        System.out.println(Arrays.toString(numbers));

        double[] prices = {1.1d, 2.5, 5.6};
        String priceString = Arrays.toString(prices);
        System.out.println(priceString);

        for (int i = 0; i < priceString.length(); i++) {
            System.out.println("character at index " + i +  " is : " + priceString.charAt(i));
        }




    }
}
