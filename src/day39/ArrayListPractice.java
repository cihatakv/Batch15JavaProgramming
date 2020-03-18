package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));

        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count = " + productLst.size());

        String itemDetails = "Apple Watch,559,21.18";

//        System.out.println("Item name = " + itemDetails.split(",")[0]);
//        System.out.println("Item Price = " + itemDetails.split(",")[1]);
//        System.out.println("Item Monthly Payments = " + itemDetails.split(",")[2]);

        // Task 1 : print only items name
        System.out.println("\n-----------Task 1 ----------");
        System.out.println("print only items name");
        for (int i = 0; i < productLst.size(); i++) {
            System.out.println("Item name = " + productLst.get(i).split(",")[0]);
        }
        //Task 2 : print all the prices more than 500
        System.out.println("\n-----------Task 2 ----------");
        System.out.println("print all the prices more than 500");
        for (int i = 0; i < productLst.size(); i++) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > 500)
                System.out.println(productLst.get(i).split(",")[0] + "'s price = " + price);
        }
        //        Task 3 : print average price
        System.out.println("\n-----------Task 3 ----------");
        System.out.println("print average price");
        double total = 0;
        double average = 0;
        for (int i = 0; i < productLst.size(); i++) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            total += price;
        }
        average = total / productLst.size();
        System.out.println("average price = " + average);

        //        Task 4 : print all the items name that has less than 20$ monthly payment.
        System.out.println("\n-----------Task 4 ----------");
        System.out.println("print all the items name that has less than 20$ monthly payment.");
        for (int i = 0; i < productLst.size(); i++) {
            double monthlyPayment = Double.parseDouble(productLst.get(i).split(",")[2]);
            if (monthlyPayment < 20)
                System.out.println("Item name's name monthly less than 20 = " + productLst.get(i).split(",")[0]);
        }

        //                Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println("\n-----------Task 5 ----------");
        System.out.println("Print the monthly payments of all the iPhone no matter what model.");
        for (int i = 0; i < productLst.size(); i++) {
            double monthlyPayment = Double.parseDouble(productLst.get(i).split(",")[2]);
            if (productLst.get(i).contains("iPhone"))
                System.out.println(productLst.get(i).split(",")[0] + "'s monthly payments = " + monthlyPayment);
        }

        //        Task 6 : Print all information about most expensive items.
        System.out.println("\n-----------Task 6 ----------");
        System.out.println("Print all information about most expensive items.");

        double max = Double.parseDouble(productLst.get(0).split(",")[1]);
        int j = 0;
        for (int i = 0; i < productLst.size(); i++) {
            if (Double.parseDouble(productLst.get(i).split(",")[1]) > max) {
                max = Double.parseDouble(productLst.get(i).split(",")[1]);
                j = i;
            }
        }
        System.out.println("Item = " + productLst.get(j));
        System.out.print("Item Name = " + productLst.get(j).split(",")[0]);
        System.out.print("\tItem Price = " + productLst.get(j).split(",")[1]);
        System.out.println("\tItem Monthly Payment = " + productLst.get(j).split(",")[2]);

        // Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
        System.out.println("\n-----------Task 7 ----------");
        System.out.println("Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)");

        for (int i = 0; i < productLst.size(); i++) {
            String itemName = productLst.get(i).split(",")[0];
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            double monthlyPayment = Double.parseDouble(productLst.get(i).split(",")[2]);
            if (productLst.get(i).contains("Dyson")) {
                productLst.set(i, itemName + "," + price * 0.2 + "," + monthlyPayment * 0.2);
                System.out.println("itemName = " + (itemName + "," + price * 0.2 + "," + monthlyPayment * 0.2));
            }
        }
        //        Task 8 : Count the items prices more than average price.
        System.out.println("\n-----------Task 8 ----------");
        System.out.println("Count the items prices more than average price.");

        int cntAboveAvg = 0;
        for (int i = 0; i < productLst.size(); i++) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > average)
                cntAboveAvg++;
        }

        System.out.println("cntAboveAvg = " + cntAboveAvg);

        //Task 9 : Remove all the items has more than average price.
        System.out.println("\n-----------Task 9 ----------");
        System.out.println("Remove all the items has more than average price.");

        for (int i = productLst.size() - 1; i >= 0; i--) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price > average)
                productLst.remove(i);
        }
        for (String each : productLst) {
            System.out.println(each);
        }

        // Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double)
        System.out.println("\n-----------Task 9 ----------");
        System.out.println("Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double) ");

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (String each : productLst) {
            itemNames.add(each.split(",")[0]);
            prices.add(Double.parseDouble(each.split(",")[1]));
            monthlyPayments.add(Double.parseDouble(each.split(",")[2]));
        }
        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);

    }
}
/*
Create an ArrayList of String to store 12 elements.
Each element should contains product information separated by comma  : at index 0 -->> iPhone 6s, 499 , 18.71 and so on
Task 1 : print only items name
Task 2 : print all the prices more than 500
Task 3 : print average price
Task 4 : print all the items name that has less than 20$ monthly payment.
Task 5 : Print the monthly payments of all the iPhone no matter what model.
Task 6 : Print all information about most expensive items.
Task 7 : Update Dyson price to 80% off (Monthly payment should also be calculated accordingly)
Task 8 : Count the items prices more than average price.
OPTIONALLY :
Task 9 : Remove all the items has more than average price.
------------------------
Create 3 more ArrayList objects to separately store  itemNames(String), prices(Double) , monthlyPayments(Double)  :
 */
