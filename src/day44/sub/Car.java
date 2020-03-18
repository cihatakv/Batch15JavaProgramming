package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle {

    int millage;

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.millage = 184000;
        System.out.println("c1.millage = " + c1.millage);

        c1.setYear(2002);
        System.out.println("c1.getYear() = " + c1.getYear());


    }


}
