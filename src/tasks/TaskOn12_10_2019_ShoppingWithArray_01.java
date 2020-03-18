package tasks;

import java.util.Arrays;

public class TaskOn12_10_2019_ShoppingWithArray_01 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        // System.out.println("groceryItems = " + Arrays.toString(groceryItems));
        int count = 0;
        // 1, loop through each grocery items and print them in one line
        System.out.println("1, loop through each grocery items and print them in one line");
        for (String eachItem : groceryItems) {

            System.out.print(eachItem);
            if (!eachItem.equals(groceryItems[groceryItems.length - 1]))
                System.out.print(" --> ");

        }
        // 1.1 print each items at odd index
        System.out.println();
        System.out.println("1.1 print each items at odd index");
        for (int i = 0; i < groceryItems.length; i++) {
            if (i % 2 == 1)
                System.out.println(groceryItems[i]);
        }
        System.out.println();
        // 1.2 print all items in reverse order
        System.out.println("1.2 print all items in reverse order");
        for (int i = groceryItems.length - 2; i >= 0; i--) {
            System.out.println(groceryItems[i]);
        }
        System.out.println();
        // 1.3 find out the index location of strawberry
        System.out.println("1.3 find out the index location of strawberry");
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].equalsIgnoreCase("Strawberry")) {
                System.out.println("Index of Strawberry is " + i);
                break;
            }
        }
        System.out.println();

        // 1.4 find out the count of groceries that contains berry in the name
        System.out.println("1.4 find out the count of groceries that contains berry in the name");
        int countBerry = 0;
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].contains("berry"))
                countBerry++;
        }
        System.out.println("countBerry = " + countBerry);
        System.out.println();
        // 1.5 print out all the character counts of the grocery items
        int characterCount = 0;
        int eachItemCharacter = 0;
        for (String eachItem : groceryItems) {
            characterCount += eachItem.length();
            eachItemCharacter++;
            System.out.println(eachItemCharacter + ". item has " + eachItem.length() + " characters.");
        }
        System.out.println("characterCount = " + characterCount);

        System.out.println();
        // 1.6 print out only those items with even character count
        for (String eachItem : groceryItems) {
            if (eachItem.length() %2 == 0)
                System.out.println(eachItem + " has " + eachItem.length() + " characters.");
        }

        System.out.println();
        // 1.7 print out only those items end with letter e
        for (String eachItem : groceryItems) {
            if (eachItem.contains("e"))
                System.out.println(eachItem + " contains letter e.");
        }

        System.out.println();
        // 1.8 print out only last 3 characters of all the items
        for (String eachItem : groceryItems) {
                System.out.println(eachItem + "'s last 3 characters are " + eachItem.substring(eachItem.length()-3));
        }

        System.out.println();
        // 1.9 create String variable called allItems and store all the items inside array separated by comma.
        String allItems = "";
        for (String eachItem : groceryItems) {
            allItems += eachItem;
            if (!eachItem.equals(groceryItems[groceryItems.length-1]))
                allItems += ", ";
        }
        System.out.println(allItems);
        System.out.println();
    }
}