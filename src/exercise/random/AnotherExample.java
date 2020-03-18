package exercise.random;

public class AnotherExample {
    public static void main(String[] args) {
//        System.out.println("My Probram just started");
//        int myFolderCount = 6;
//        myFolderCount = 10;
//        System.out.println(myFolderCount);
//        myFolderCount = 100;
//        System.out.println(myFolderCount);
//        -2147483648
//                -1

        long x = -2147483648L;
        long y = -1L;
        long f = Long.valueOf(x);
        long a = Math.abs(x);
        long b = Math.abs(y);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (y == 0 || Math.abs(x) < Math.abs(y)) {
            System.out.println("Not divisible or x < y");
            return;
        }
        int quotient = 0;
        do {
            a -= b;
            quotient++;
        } while (a >= b);

        System.out.println("quotient = " + quotient);


    }

}
