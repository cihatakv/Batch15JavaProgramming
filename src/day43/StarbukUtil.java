package day43;

public class StarbukUtil {
    public static void main(String[] args) {

        printCoffeeInfo(new Coffee("Blonde", 5, 1.6));

    }

    // Create a static method to accept a coffee object and print it's information
    // like this; This coffee is : name, price <price>, caffeine level is <level>

    public static void printCoffeeInfo(Coffee co) {
        System.out.println(co);
    }

}
