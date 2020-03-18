package day21;

public class NestedLoop {
    public static void main(String[] args) {
        // count 1 to 1
        // count 1 to 2
        // count 1 to 3
        // count 1 to 4

        for (int i = 1; i <=100 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
