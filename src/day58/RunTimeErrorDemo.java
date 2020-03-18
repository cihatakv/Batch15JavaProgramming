package day58;

public class RunTimeErrorDemo {
    static int num = 0;

    public static void main(String[] args) {

        num += 2;
        System.out.println("num = " + num);

        // call main method again


    }

}
