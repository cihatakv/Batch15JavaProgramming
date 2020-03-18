package day41;

public class Product {

    private String name;
    private double price;

    // this keyword can be used to refer the current object
    // we are working on

    public void setName(String name) {
        // name = newName;
        this.name = name;
    }

    public String getName() {
        return this.name;
        // return name;
    }

    public void setPrice(double price) {
//        if (newPrice > 0)
//            price = newPrice;
        if (price > 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
