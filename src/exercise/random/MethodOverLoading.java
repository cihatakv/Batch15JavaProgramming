package exercise.random;

public class MethodOverLoading {
    public static void main(String[] args) {

        Integer x = 3;
        Integer y = 4;
        System.out.println(total(x,y));

    }

//    public static void total (int a, int b) {
//        System.out.println("a + b = " + a + b);
//    }

    public static int total (int a, int b) {
        return a + b;
    }

    public static int total (Integer a1, Integer b1) {
        return a1 + b1;
    }
}
