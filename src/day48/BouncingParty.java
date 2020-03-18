package day48;

public class BouncingParty {

    public static void main(String[] args) {
        System.out.println("Bouncible.GRAVITY = " + Bouncible.GRAVITY);
        Kangaroo b1 = new Kangaroo("Coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();
        b1.eat();
        b1.carryChildInThePocket();
        b1.kickBox();

//        List<Integer> lst = new


        Ball b2 = new Ball("Round", "Blue");
        System.out.println("b2 = " + b2);
        b2.bounce();

        System.out.println(Bouncible.GRAVITY);

    }

}
