package day40;

public class SpaceShipActions {
    public static void main(String[] args) {
        SpaceShip s1 = new SpaceShip();

        s1.name = "Apollo";
//        s1.currentDirection = "Down";
//        s1.xCoordinate = 0;
//        s1.yCoordinate = 0;

//        System.out.println("s1 = " + s1);

        s1.setInitialPosition(1, 5);
//
//        System.out.println("s1  After setting Position = " + s1);
//
//        s1.setDirection("Right");
//
//        System.out.println("s1  After setting direction = " + s1);
//
//        s1.move1Block();
//
//        System.out.println("s1  After moving 1 block = " + s1);

//        System.out.println("s1 = " + s1);

        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("down");
        s1.move1Block("HOME");

        System.out.println("s1 = " + s1);


    }
}
