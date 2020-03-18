package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name; // adding a field so we can give a name to Store object when we create one
    private List<Product> allProducts; // store has List of Products

    public Store() {
        name = "Cybertek Store";
        allProducts = new ArrayList<>();
    }

    public Store(String name, List<Product> allProducts) {
        this();
        this.name = name;
        this.allProducts.addAll(allProducts);
        this.allProducts = allProducts;
    }

    public List<Product> getAllProductsMoreThanAveragePrice() {
        List<Product> moreThanAverage = null;
        double average = getAveragePrice();
        for (Product each : allProducts) {
            if (each.getPrice() > average)
                moreThanAverage.add(each);
        }
        return moreThanAverage;
    }

    public Product getMostExpensiveProduct() {

        Product MaxProduct = null;
        int max = Integer.MIN_VALUE;
        for (Product each : allProducts) {
            if (each.getPrice() > max) {
                max = each.getPrice();
                MaxProduct = each;
            }
        }
        return MaxProduct;

    }

    public double getAveragePrice() {
        return findSumOfAllProductPrice() / getProductCount();
    }

    public int findSumOfAllProductPrice() {
        int sum = 0;
        for (Product each : allProducts) {
            sum += each.getPrice();
        }
        return sum;
    }

    public boolean checkIfProductExists(Product p) {
        return allProducts.contains(p);
        // return allProducts.indexOf(p) >= 0;
    }

    public int indexOfProduct(Product p) {
        return allProducts.indexOf(p);
    }

    public int getProductCount() {

        return allProducts.size();

    }

    public void displayProduct() {
        System.out.println(name + "'s Store has below product: ");
        for (Product each : allProducts) {
            System.out.println("\t each = " + each);
        }
    }

    public void addProduct(Product p) {
        System.out.println("Calling addProduct(Product p)");
        allProducts.add(p);
    }

    public void addProduct(String productName, int productPrice) {
        System.out.println("Calling addProduct(Product p)");
        allProducts.add(new Product(productName, productPrice));
    }

    public void removeProduct(Product p) {
        if (checkIfProductExists(p)) {
            allProducts.remove(p);
        } else {
            System.out.println("We don't have " + p);
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}

/*
1 Arg constructor to accept List<Product>
First line of constructor should call nonath constructor to reuse initialization logic.
Inside constructor AddAll Products user passed to the instance variable last.
Create an instance void method called addProduct(Product p)
Create an instance void method called removeProduct(Product p)
Create an instance void method called checkIfProductExist(Product p)
Hint : just call list remove method, it will internally call .equal method to decide which one to remove
more methods : find and return max price product, Find sum.of all products
Find list of products more than average  (edited)
 */