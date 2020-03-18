package day58;

public class CheckedExceptionDemo {
    public static void main(String[] args) {

        System.out.println("Checked Exception in next line");

        try {
            Thread.sleep(4000);
            System.out.println("in Try");
        } catch (InterruptedException e) {
            System.out.println("Exception was caught");

        }

        System.out.println("After sleep");
    }
}
