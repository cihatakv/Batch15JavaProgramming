package day07;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {
        int offerCount = 2 ;
        int x = 2;
        int y = 2;
        offerCount ++;

        System.out.println("Offer Count: " + offerCount);
        x++;
        System.out.println("x = " + x);
        ++y;
        System.out.println("y = " + y);

        int z = ++y + 1;

        System.out.println("z = " + z);
        System.out.println(z ++);
        System.out.println(z);


    }
}
