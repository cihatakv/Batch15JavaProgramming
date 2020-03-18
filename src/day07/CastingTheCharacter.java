package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {
        char aChar = '1';
        int n = aChar;
        System.out.println(n);

        int x = 100;
        char dChar = (char) x;
        System.out.println(dChar);

        System.out.println("\n \n \n ---------------------------------");

        char ch = '9';
        char ch2 = '9';

        /* Since parseInt() method of Integer class accepts
         * String argument only, we must need to convert
         * the char to String first using the String.valueOf()
         * method and then we pass the String to the parseInt()
         * method to convert the char to int
         */
        int num = Integer.parseInt(String.valueOf(ch));
        System.out.println(num);
        int num2 = (int) ch2;
        System.out.println(num2);


    }
}
