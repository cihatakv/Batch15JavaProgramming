package day48;

public class Lion extends Mammals {

    public static void main(String[] args) {
        Lion l1 = new Lion();
        Mammals m1 = new Lion();

        l1.drinkMilk();
        l1.makeNoise();

        Animal a1 = new Lion();
        a1.makeNoise();
        // a1.drinkMilk(); // ---> DOES NOT COMPLILE!!!!


    }

    @Override
    public void drinkMilk() {
        System.out.println("LIONS DRINK MILK");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAY ROARRRRRR!!!!");
    }
}
