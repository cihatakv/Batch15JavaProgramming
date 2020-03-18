package day06;

public class CoinConverter {
    public static void main(String[] args) {
        int cent = 200;
        cent -= 74;
        int quarter = cent / 25;
        int penny = cent % 25 ;
        System.out.println(quarter + " Quarters");
        System.out.println(penny + " Penny");
        System.out.println(cent + " cents");

        int dime = cent / 10;
        penny = cent % 10;

        System.out.println(dime + " Dimes");
        System.out.println(penny + " Penny");


    }
}
