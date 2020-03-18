package day49;

public class Burger implements Edible, Juicy {


    @Override
    public void melt() {
        System.out.println("Juicy burger is melting ");
    }

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink Soda ");
    }
}
