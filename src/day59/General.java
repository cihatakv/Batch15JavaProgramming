package day59;

public class General {

    public static void main(String[] args) {

        Object o = new String("abc");
        // can i get the first char using o
        // System.out.println(o.charAt(0));

        String str = null;


        try {
            System.out.println(str.charAt(0));
        } catch (NullPointerException bla) {
            System.out.println("NO OBJECT HERE!!!");
        }

        System.out.println();


    }
}
