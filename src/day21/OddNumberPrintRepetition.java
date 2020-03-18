package day21;

public class OddNumberPrintRepetition {
    // 1 to 10 print only odd numbers

    // repeat this 4 times

    public static void main(String[] args){
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i %2 == 1)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
