package day42;

public class Bike {

    int gear;
    int speed;

    public Bike() {
        System.out.println("Message from Constructor");
        //this.gear = 1;
    }

    public Bike(int newGear) {
        gear = newGear;
        // this.gear = newGear;
    }

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }


}
