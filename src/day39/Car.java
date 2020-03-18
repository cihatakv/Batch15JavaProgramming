package day39;

public class Car {

    int year;
    String model;
    String make;
    String color;

    public void goForward() {
        System.out.println(make + " Going Forward");
    }

    public void printCarAge() {
        System.out.println("Car age : " + (2020 - year));
    }

}
