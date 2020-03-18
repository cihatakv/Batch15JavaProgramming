package day39;

public class Garage2 {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.year = 2017;
        c1.model = "Nissan";
        c1.make = "Rogue";
        c1.color = "Red";

        System.out.println("Car1 = " + c1.year + " | " + c1.model + " | " + c1.make + " | " + c1.color);
        c1.goForward();
        c1.printCarAge();

        Car car2 = new Car();
        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        System.out.println("car2.make = " + car2.model);
        System.out.println("car2.color = " + car2.color);


    }
}
