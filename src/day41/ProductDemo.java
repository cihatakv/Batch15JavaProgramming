package day41;

public class ProductDemo {

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setName("iPhone");
        p1.setPrice(699);

        System.out.println("p1.getName() = " + p1.getName());
        double myPrice = p1.getPrice();

        System.out.println("myPrice = " + myPrice);


    }

}
